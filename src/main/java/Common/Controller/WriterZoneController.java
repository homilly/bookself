package Common.Controller;

import Common.Service.WriterZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WriterZoneController {
    @Autowired
    WriterZoneService writerZoneService;

    @RequestMapping("/zone")
    @ResponseBody
    public String getWriterArticles(@RequestParam long id) {

        writerZoneService.getWriterInfo(id);

        writerZoneService.getArticlesByWriter(id);

        return "writerGroundPage";
    }
}
