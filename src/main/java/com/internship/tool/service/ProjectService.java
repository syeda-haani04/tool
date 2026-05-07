import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProjectService {
@Cacheable("projects")
public List<String> getProjects() {
        return List.of(
                "Penetration Testing Dashboard",
                "Vulnerability Scanner",
                "Security Report Generator"
        );
    }
}
