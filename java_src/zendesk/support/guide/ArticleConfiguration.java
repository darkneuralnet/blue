package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import zendesk.messaging.Engine;
import zendesk.messaging.EngineListRegistry;
import zendesk.support.Article;
/* loaded from: classes8.dex */
public class ArticleConfiguration implements InterfaceC40057dx0 {
    static final int ARTICLE_ID = 1;
    static final int ARTICLE_MODEL = 2;
    static final int UNKNOWN = -1;
    private final ArticleViewModel article;
    private final long articleId;
    private final int configurationState;
    private final List<InterfaceC40057dx0> configurations;
    private final boolean contactUsVisible;
    private final String engineRegistryId;

    /* loaded from: classes8.dex */
    public static class Builder {
        private ArticleViewModel article;
        private long articleId;
        private boolean contactUsVisible = true;
        private List<InterfaceC40057dx0> configurations = Collections.emptyList();
        private List<Engine> engines = Collections.emptyList();
        private int configurationState = -1;

        public Builder(long j) {
            this.articleId = j;
        }

        private void setConfigurations(List<InterfaceC40057dx0> list) {
            if (C43505jm0.m29948i(list)) {
                this.configurations = list;
                ArticleConfiguration articleConfiguration = (ArticleConfiguration) C32054Bx0.m113273h().m113276e(list, ArticleConfiguration.class);
                if (articleConfiguration != null) {
                    this.contactUsVisible = articleConfiguration.isContactUsButtonVisible();
                    this.engines = EngineListRegistry.INSTANCE.retrieveEngineList(articleConfiguration.engineRegistryId);
                }
            }
        }

        public InterfaceC40057dx0 config() {
            return new ArticleConfiguration(this, EngineListRegistry.INSTANCE.register(this.engines));
        }

        public Intent intent(Context context, InterfaceC40057dx0... interfaceC40057dx0Arr) {
            return intent(context, Arrays.asList(interfaceC40057dx0Arr));
        }

        public void show(Context context, InterfaceC40057dx0... interfaceC40057dx0Arr) {
            context.startActivity(intent(context, interfaceC40057dx0Arr));
        }

        public Builder withContactUsButtonVisible(boolean z) {
            this.contactUsVisible = z;
            return this;
        }

        public Builder withEngines(List<Engine> list) {
            this.engines = list;
            return this;
        }

        public Intent intent(Context context, List<InterfaceC40057dx0> list) {
            setConfigurations(list);
            InterfaceC40057dx0 config = config();
            Intent intent = new Intent(context, ViewArticleActivity.class);
            C32054Bx0.m113273h().m113278c(intent, config);
            return intent;
        }

        public void show(Context context, List<InterfaceC40057dx0> list) {
            context.startActivity(intent(context, list));
        }

        public Builder withEngines(Engine... engineArr) {
            return withEngines(Arrays.asList(engineArr));
        }

        public Builder(Article article) {
            this.article = new ArticleViewModel(article);
        }

        public Builder() {
        }
    }

    public ArticleViewModel getArticle() {
        return this.article;
    }

    public long getArticleId() {
        return this.articleId;
    }

    public int getConfigurationState() {
        return this.configurationState;
    }

    @Override // p000.InterfaceC40057dx0
    @SuppressLint({"RestrictedApi"})
    public List<InterfaceC40057dx0> getConfigurations() {
        return C32054Bx0.m113273h().m113280a(this.configurations, this);
    }

    public List<Engine> getEngines() {
        return EngineListRegistry.INSTANCE.retrieveEngineList(this.engineRegistryId);
    }

    public boolean isContactUsButtonVisible() {
        return this.contactUsVisible;
    }

    private ArticleConfiguration(Builder builder, String str) {
        this.configurationState = builder.configurationState;
        this.article = builder.article;
        this.articleId = builder.articleId;
        this.contactUsVisible = builder.contactUsVisible;
        this.configurations = builder.configurations;
        this.engineRegistryId = str;
    }
}
