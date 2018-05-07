package org.broadleafcommerce.admin.web.controller.entity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller("blAdminBaseProductController")
@RequestMapping("/"+ AdminProductController.SECTION_KEY + ":" + AdminBaseProductController.SECTION_KEY)
public class AdminBaseProductController extends AdminProductController {

    public static final String SECTION_KEY = "product";

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String viewEntityForm(HttpServletRequest request, HttpServletResponse response, Model model,
                                 @PathVariable Map<String, String> pathVars,
                                 @PathVariable(value = "id") String id) throws Exception {
        String view = super.viewEntityForm(request, response, model, pathVars, id);
        return view;
    }
}
