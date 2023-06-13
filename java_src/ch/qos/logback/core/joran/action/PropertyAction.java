package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.action.ActionUtil;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import org.xml.sax.Attributes;
/* loaded from: classes.dex */
public class PropertyAction extends Action {
    static String INVALID_ATTRIBUTES = "In <property> element, either the \"file\" attribute alone, or the \"resource\" element alone, or both the \"name\" and \"value\" attributes must be set.";
    static final String RESOURCE_ATTRIBUTE = "resource";

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        String str2;
        String subst;
        StringBuilder sb;
        String str3;
        if ("substitutionProperty".equals(str)) {
            addWarn("[substitutionProperty] element has been deprecated. Please use the [property] element instead.");
        }
        String value = attributes.getValue("name");
        String value2 = attributes.getValue("value");
        ActionUtil.Scope stringToScope = ActionUtil.stringToScope(attributes.getValue(Action.SCOPE_ATTRIBUTE));
        if (!checkFileAttributeSanity(attributes)) {
            if (checkResourceAttributeSanity(attributes)) {
                subst = interpretationContext.subst(attributes.getValue(RESOURCE_ATTRIBUTE));
                URL resourceBySelfClassLoader = Loader.getResourceBySelfClassLoader(subst);
                if (resourceBySelfClassLoader == null) {
                    str2 = "Could not find resource [" + subst + "].";
                } else {
                    try {
                        loadAndSetProperties(interpretationContext, FirebasePerfUrlConnection.openStream(resourceBySelfClassLoader), stringToScope);
                        return;
                    } catch (IOException e) {
                        e = e;
                        sb = new StringBuilder();
                        str3 = "Could not read resource file [";
                    }
                }
            } else if (checkValueNameAttributesSanity(attributes)) {
                ActionUtil.setProperty(interpretationContext, value, interpretationContext.subst(RegularEscapeUtil.basicEscape(value2).trim()), stringToScope);
                return;
            } else {
                str2 = INVALID_ATTRIBUTES;
            }
            addError(str2);
            return;
        }
        subst = interpretationContext.subst(attributes.getValue("file"));
        try {
            loadAndSetProperties(interpretationContext, new FileInputStream(subst), stringToScope);
            return;
        } catch (FileNotFoundException e2) {
            e = e2;
            sb = new StringBuilder();
            str3 = "Could not find properties file [";
        } catch (IOException e3) {
            e = e3;
            sb = new StringBuilder();
            str3 = "Could not read properties file [";
        }
        sb.append(str3);
        sb.append(subst);
        sb.append("].");
        addError(sb.toString(), e);
    }

    public boolean checkFileAttributeSanity(Attributes attributes) {
        return !OptionHelper.isEmpty(attributes.getValue("file")) && OptionHelper.isEmpty(attributes.getValue("name")) && OptionHelper.isEmpty(attributes.getValue("value")) && OptionHelper.isEmpty(attributes.getValue(RESOURCE_ATTRIBUTE));
    }

    public boolean checkResourceAttributeSanity(Attributes attributes) {
        return !OptionHelper.isEmpty(attributes.getValue(RESOURCE_ATTRIBUTE)) && OptionHelper.isEmpty(attributes.getValue("name")) && OptionHelper.isEmpty(attributes.getValue("value")) && OptionHelper.isEmpty(attributes.getValue("file"));
    }

    public boolean checkValueNameAttributesSanity(Attributes attributes) {
        return !OptionHelper.isEmpty(attributes.getValue("name")) && !OptionHelper.isEmpty(attributes.getValue("value")) && OptionHelper.isEmpty(attributes.getValue("file")) && OptionHelper.isEmpty(attributes.getValue(RESOURCE_ATTRIBUTE));
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
    }

    public void finish(InterpretationContext interpretationContext) {
    }

    public void loadAndSetProperties(InterpretationContext interpretationContext, InputStream inputStream, ActionUtil.Scope scope) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        inputStream.close();
        ActionUtil.setProperties(interpretationContext, properties, scope);
    }
}
