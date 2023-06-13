package ch.qos.logback.core.rolling.helper;

import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.io.File;
import java.util.List;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
class RegexPathPart extends PathPart {
    private Pattern pattern;

    public RegexPathPart(String str) {
        super(str);
        this.pattern = Pattern.compile(str);
    }

    @Override // ch.qos.logback.core.rolling.helper.PathPart
    public List<File> listFiles(FileProvider fileProvider) {
        return listFiles(fileProvider, InstructionFileId.DOT);
    }

    @Override // ch.qos.logback.core.rolling.helper.PathPart
    public boolean matches(File file) {
        return this.pattern.matcher(file.getName()).find();
    }
}
