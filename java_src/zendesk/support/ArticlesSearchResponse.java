package zendesk.support;

import java.util.List;
/* loaded from: classes8.dex */
class ArticlesSearchResponse implements ArticlesResponse {
    private List<Category> categories;
    private String nextPage;
    private String previousPage;
    private List<Article> results;
    private List<Section> sections;
    private List<zendesk.core.User> users;

    @Override // zendesk.support.ArticlesResponse
    public List<Article> getArticles() {
        return C43505jm0.m29954c(this.results);
    }

    @Override // zendesk.support.ArticlesResponse
    public List<Category> getCategories() {
        return C43505jm0.m29954c(this.categories);
    }

    public String getNextPage() {
        return this.nextPage;
    }

    public String getPreviousPage() {
        return this.previousPage;
    }

    @Override // zendesk.support.ArticlesResponse
    public List<Section> getSections() {
        return C43505jm0.m29954c(this.sections);
    }

    @Override // zendesk.support.ArticlesResponse
    public List<zendesk.core.User> getUsers() {
        return C43505jm0.m29954c(this.users);
    }
}
