package Common.Service;

import Common.Entity.Article;
import Common.Entity.Writer;
import Common.Model.WriterModel;
import Common.Repository.ArticleRepository;
import Common.Repository.WriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WriterZoneService {

    @Resource
    WriterRepository writerRepository;

    @Resource
    private ArticleRepository articleRepository;





    public void getWriterInfo(long id){

        Writer writer = writerRepository.findById(id);



    }

    public void getArticlesByWriter(long id) {

        long articlr_id = 000;

        Article article = articleRepository.findById(articlr_id);

    }
}
