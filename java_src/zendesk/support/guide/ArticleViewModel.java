package zendesk.support.guide;

import java.io.Serializable;
import java.util.Date;
import zendesk.support.Article;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ArticleViewModel implements Serializable {
    private final String authorName;
    private final String body;
    private final Date createdAt;

    /* renamed from: id */
    private final long f121964id;
    private final String title;

    public ArticleViewModel(Article article) {
        String name;
        this.f121964id = article.getId().longValue();
        this.title = article.getTitle();
        this.body = article.getBody();
        this.createdAt = article.getCreatedAt();
        if (article.getAuthor() == null) {
            name = null;
        } else {
            name = article.getAuthor().getName();
        }
        this.authorName = name;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getBody() {
        return this.body;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public long getId() {
        return this.f121964id;
    }

    public String getTitle() {
        return this.title;
    }
}
