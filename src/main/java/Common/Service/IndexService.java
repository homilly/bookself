package Common.Service;

import Common.Entity.User;
import Common.Entity.Writer;
import Common.Repository.UserRepository;
import Common.Repository.WriterRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class IndexService {

    @Resource
    UserRepository userRepository;

    @Resource
    WriterRepository writerRepository;

    /**
     * 网站所有作者信息
     * @return
     */
    public List<Writer> getAllWriters() {

        Iterable<Writer> person = writerRepository.findAll();

        List<Writer> writerList = new ArrayList<>();

        person.forEach(writer -> {writerList.add(writer);} );

        return writerList;

    }






}
