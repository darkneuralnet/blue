package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import org.xml.sax.Attributes;
/* loaded from: classes.dex */
public abstract class AbstractIncludeAction extends Action {
    private static final String FILE_ATTR = "file";
    private static final String OPTIONAL_ATTR = "optional";
    private static final String RESOURCE_ATTR = "resource";
    private static final String URL_ATTR = "url";
    private String attributeInUse;
    private boolean optional;

    private URL attributeToURL(String str) {
        StringBuilder sb;
        String str2;
        try {
            URL url = new URL(str);
            FirebasePerfUrlConnection.openStream(url).close();
            return url;
        } catch (MalformedURLException e) {
            e = e;
            sb = new StringBuilder();
            sb.append("URL [");
            sb.append(str);
            str2 = "] is not well formed.";
            sb.append(str2);
            optionalWarning(sb.toString(), e);
            return null;
        } catch (IOException e2) {
            e = e2;
            sb = new StringBuilder();
            sb.append("URL [");
            sb.append(str);
            str2 = "] cannot be opened.";
            sb.append(str2);
            optionalWarning(sb.toString(), e);
            return null;
        }
    }

    private boolean checkAttributes(Attributes attributes) {
        String format;
        String value = attributes.getValue("file");
        String value2 = attributes.getValue("url");
        String value3 = attributes.getValue(RESOURCE_ATTR);
        int i = !OptionHelper.isEmpty(value) ? 1 : 0;
        if (!OptionHelper.isEmpty(value2)) {
            i++;
        }
        if (!OptionHelper.isEmpty(value3)) {
            i++;
        }
        if (i == 0) {
            format = String.format("One of \"%1$s\", \"%2$s\" or \"%3$s\" attributes must be set.", "file", RESOURCE_ATTR, "url");
        } else if (i <= 1) {
            if (i == 1) {
                return true;
            }
            throw new IllegalStateException("Count value [" + i + "] is not expected");
        } else {
            format = String.format("Only one of \"%1$s\", \"%2$s\" or \"%3$s\" attributes should be set.", "file", RESOURCE_ATTR, "url");
        }
        optionalWarning(format, null);
        return false;
    }

    private URL filePathAsURL(String str) {
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            try {
                return file.toURI().toURL();
            } catch (MalformedURLException e) {
                e.printStackTrace();
                return null;
            }
        }
        optionalWarning("File does not exist [" + str + "]", new FileNotFoundException(str));
        return null;
    }

    private URL getInputURL(InterpretationContext interpretationContext, Attributes attributes) {
        String value = attributes.getValue("file");
        String value2 = attributes.getValue("url");
        String value3 = attributes.getValue(RESOURCE_ATTR);
        if (!OptionHelper.isEmpty(value)) {
            String subst = interpretationContext.subst(value);
            this.attributeInUse = subst;
            return filePathAsURL(subst);
        } else if (!OptionHelper.isEmpty(value2)) {
            String subst2 = interpretationContext.subst(value2);
            this.attributeInUse = subst2;
            return attributeToURL(subst2);
        } else if (OptionHelper.isEmpty(value3)) {
            throw new IllegalStateException("A URL stream should have been returned");
        } else {
            String subst3 = interpretationContext.subst(value3);
            this.attributeInUse = subst3;
            return resourceAsURL(subst3);
        }
    }

    private URL resourceAsURL(String str) {
        URL resourceBySelfClassLoader = Loader.getResourceBySelfClassLoader(str);
        if (resourceBySelfClassLoader == null) {
            optionalWarning("Could not find resource corresponding to [" + str + "]", null);
            return null;
        }
        return resourceBySelfClassLoader;
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        this.attributeInUse = null;
        this.optional = OptionHelper.toBoolean(attributes.getValue(OPTIONAL_ATTR), false);
        if (checkAttributes(attributes)) {
            try {
                URL inputURL = getInputURL(interpretationContext, attributes);
                if (inputURL != null) {
                    processInclude(interpretationContext, inputURL);
                }
            } catch (JoranException e) {
                optionalWarning("Error while parsing " + this.attributeInUse, e);
            }
        }
    }

    public void close(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) throws ActionException {
    }

    public String getAttributeInUse() {
        return this.attributeInUse;
    }

    public void handleError(String str, Exception exc) {
        if (exc == null || !((exc instanceof FileNotFoundException) || (exc instanceof UnknownHostException))) {
            addError(str, exc);
        } else {
            addWarn(str, exc);
        }
    }

    public boolean isOptional() {
        return this.optional;
    }

    public void optionalWarning(String str, Exception exc) {
        if (isOptional()) {
            return;
        }
        handleError(str, exc);
    }

    public abstract void processInclude(InterpretationContext interpretationContext, URL url) throws JoranException;
}
