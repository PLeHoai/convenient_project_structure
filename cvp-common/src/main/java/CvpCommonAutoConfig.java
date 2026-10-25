import com.convpack.datetime.CvpDatetimeConfig;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@Import({
        CvpDatetimeConfig.class
})
public class CvpCommonAutoConfig
{

}
