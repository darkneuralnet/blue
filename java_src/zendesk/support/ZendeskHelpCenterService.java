package zendesk.support;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p000.ON4;
import zendesk.core.ZendeskLocaleConverter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ZendeskHelpCenterService {
    private static final String LOG_TAG = "ZendeskHelpCenterService";
    private static final int NUMBER_PER_PAGE = 1000;
    private final HelpCenterService helpCenterService;
    private final ZendeskLocaleConverter localeConverter;

    public ZendeskHelpCenterService(HelpCenterService helpCenterService, ZendeskLocaleConverter zendeskLocaleConverter) {
        this.helpCenterService = helpCenterService;
        this.localeConverter = zendeskLocaleConverter;
    }

    public void deleteVote(Long l, AbstractC44415lI6<Void> abstractC44415lI6) {
        if (l == null) {
            C33694Ix2.m101454e(LOG_TAG, "The vote id was null, can not delete the vote", new Object[0]);
            if (abstractC44415lI6 != null) {
                abstractC44415lI6.onError(new C49968ug1("The vote id was null, can not delete the vote"));
                return;
            }
            return;
        }
        this.helpCenterService.deleteVote(l).mo1284E0(new ON4(abstractC44415lI6));
    }

    public void downvoteArticle(Long l, String str, AbstractC44415lI6<ArticleVoteResponse> abstractC44415lI6) {
        if (l == null) {
            C33694Ix2.m101454e(LOG_TAG, "The article id was null, can not create down vote", new Object[0]);
            if (abstractC44415lI6 != null) {
                abstractC44415lI6.onError(new C49968ug1("The article id was null, can not create down vote"));
                return;
            }
            return;
        }
        this.helpCenterService.downvoteArticle(l, str).mo1284E0(new ON4(abstractC44415lI6));
    }

    public void getArticle(Long l, Locale locale, String str, AbstractC44415lI6<Article> abstractC44415lI6) {
        String helpCenterLocaleString = this.localeConverter.toHelpCenterLocaleString(locale);
        this.helpCenterService.getArticle(helpCenterLocaleString, l, str).mo1284E0(new ON4(abstractC44415lI6, new ON4.InterfaceC5984b<ArticleResponse, Article>() { // from class: zendesk.support.ZendeskHelpCenterService.4
            @Override // p000.ON4.InterfaceC5984b
            public Article extract(ArticleResponse articleResponse) {
                return ZendeskHelpCenterService.this.matchArticleWithUsers(articleResponse.getArticle(), C43505jm0.m29952e(articleResponse.getUsers()));
            }
        }));
    }

    public void getArticlesForSection(Long l, Locale locale, String str, String str2, AbstractC44415lI6<List<Article>> abstractC44415lI6) {
        this.helpCenterService.getArticles(this.localeConverter.toHelpCenterLocaleString(locale), l, str2, str, 1000).mo1284E0(new ON4(abstractC44415lI6, new ON4.InterfaceC5984b<ArticlesListResponse, List<Article>>() { // from class: zendesk.support.ZendeskHelpCenterService.3
            @Override // p000.ON4.InterfaceC5984b
            public List<Article> extract(ArticlesListResponse articlesListResponse) {
                return ZendeskHelpCenterService.this.matchArticlesWithUsers(articlesListResponse.getUsers(), articlesListResponse.getArticles());
            }
        }));
    }

    public void getAttachments(Locale locale, Long l, AttachmentType attachmentType, AbstractC44415lI6<List<HelpCenterAttachment>> abstractC44415lI6) {
        if (attachmentType == null) {
            C33694Ix2.m101454e(LOG_TAG, "getAttachments() was called with null attachment type", new Object[0]);
            if (abstractC44415lI6 != null) {
                abstractC44415lI6.onError(new C49968ug1("getAttachments() was called with null attachment type"));
                return;
            }
            return;
        }
        this.helpCenterService.getAttachments(this.localeConverter.toHelpCenterLocaleString(locale), l, attachmentType.getAttachmentType()).mo1284E0(new ON4(abstractC44415lI6, new ON4.InterfaceC5984b<AttachmentResponse, List<HelpCenterAttachment>>() { // from class: zendesk.support.ZendeskHelpCenterService.7
            @Override // p000.ON4.InterfaceC5984b
            public List<HelpCenterAttachment> extract(AttachmentResponse attachmentResponse) {
                return attachmentResponse.getArticleAttachments();
            }
        }));
    }

    public void getCategories(Locale locale, AbstractC44415lI6<List<Category>> abstractC44415lI6) {
        this.helpCenterService.getCategories(this.localeConverter.toHelpCenterLocaleString(locale)).mo1284E0(new ON4(abstractC44415lI6, new ON4.InterfaceC5984b<CategoriesResponse, List<Category>>() { // from class: zendesk.support.ZendeskHelpCenterService.1
            @Override // p000.ON4.InterfaceC5984b
            public List<Category> extract(CategoriesResponse categoriesResponse) {
                return categoriesResponse.getCategories();
            }
        }));
    }

    public void getCategoryById(Long l, Locale locale, AbstractC44415lI6<Category> abstractC44415lI6) {
        this.helpCenterService.getCategoryById(this.localeConverter.toHelpCenterLocaleString(locale), l).mo1284E0(new ON4(abstractC44415lI6, new ON4.InterfaceC5984b<CategoryResponse, Category>() { // from class: zendesk.support.ZendeskHelpCenterService.6
            @Override // p000.ON4.InterfaceC5984b
            public Category extract(CategoryResponse categoryResponse) {
                return categoryResponse.getCategory();
            }
        }));
    }

    public void getHelp(Locale locale, String str, String str2, String str3, int i, String str4, AbstractC44415lI6<HelpResponse> abstractC44415lI6) {
        this.helpCenterService.getHelp(this.localeConverter.toHelpCenterLocaleString(locale), str, str2, str3, i, str4, 1000, SortBy.CREATED_AT.getApiValue(), SortOrder.DESCENDING.getApiValue()).mo1284E0(new ON4(abstractC44415lI6));
    }

    public void getSectionById(Long l, Locale locale, AbstractC44415lI6<Section> abstractC44415lI6) {
        this.helpCenterService.getSectionById(this.localeConverter.toHelpCenterLocaleString(locale), l).mo1284E0(new ON4(abstractC44415lI6, new ON4.InterfaceC5984b<SectionResponse, Section>() { // from class: zendesk.support.ZendeskHelpCenterService.5
            @Override // p000.ON4.InterfaceC5984b
            public Section extract(SectionResponse sectionResponse) {
                return sectionResponse.getSection();
            }
        }));
    }

    public void getSectionsForCategory(Long l, Locale locale, AbstractC44415lI6<List<Section>> abstractC44415lI6) {
        this.helpCenterService.getSections(this.localeConverter.toHelpCenterLocaleString(locale), l, 1000).mo1284E0(new ON4(abstractC44415lI6, new ON4.InterfaceC5984b<SectionsResponse, List<Section>>() { // from class: zendesk.support.ZendeskHelpCenterService.2
            @Override // p000.ON4.InterfaceC5984b
            public List<Section> extract(SectionsResponse sectionsResponse) {
                return sectionsResponse.getSections();
            }
        }));
    }

    public void getSuggestedArticles(String str, Locale locale, String str2, Long l, Long l2, AbstractC44415lI6<Object> abstractC44415lI6) {
        String helpCenterLocaleString = this.localeConverter.toHelpCenterLocaleString(locale);
        this.helpCenterService.getSuggestedArticles(str, helpCenterLocaleString, str2, l, l2).mo1284E0(new ON4(abstractC44415lI6));
    }

    public void listArticles(String str, Locale locale, String str2, String str3, String str4, Integer num, Integer num2, AbstractC44415lI6<ArticlesListResponse> abstractC44415lI6) {
        this.helpCenterService.listArticles(this.localeConverter.toHelpCenterLocaleString(locale), str, str2, str3, str4, num, num2).mo1284E0(new ON4(abstractC44415lI6));
    }

    public Article matchArticleWithUsers(Article article, List<zendesk.core.User> list) {
        if (article == null) {
            return new Article();
        }
        Iterator<zendesk.core.User> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zendesk.core.User next = it.next();
            if (next.getId() != null && next.getId().equals(article.getAuthorId())) {
                article.setAuthor(next);
                break;
            }
        }
        return article;
    }

    public List<Article> matchArticlesWithUsers(List<zendesk.core.User> list, List<Article> list2) {
        HashMap hashMap = new HashMap();
        for (zendesk.core.User user : list) {
            hashMap.put(user.getId(), user);
        }
        ArrayList arrayList = new ArrayList();
        for (Article article : list2) {
            zendesk.core.User user2 = (zendesk.core.User) hashMap.get(article.getAuthorId());
            if (user2 != null) {
                article.setAuthor(user2);
            }
            arrayList.add(article);
        }
        return arrayList;
    }

    public void searchArticles(String str, Locale locale, String str2, String str3, String str4, String str5, Integer num, Integer num2, AbstractC44415lI6<ArticlesSearchResponse> abstractC44415lI6) {
        this.helpCenterService.searchArticles(str, this.localeConverter.toHelpCenterLocaleString(locale), str2, str3, str4, str5, num, num2).mo1284E0(new ON4(abstractC44415lI6));
    }

    public void submitRecordArticleView(Long l, Locale locale, RecordArticleViewRequest recordArticleViewRequest, AbstractC44415lI6<Void> abstractC44415lI6) {
        this.helpCenterService.submitRecordArticleView(l, this.localeConverter.toHelpCenterLocaleString(locale), recordArticleViewRequest).mo1284E0(new ON4(abstractC44415lI6));
    }

    public void upvoteArticle(Long l, String str, AbstractC44415lI6<ArticleVoteResponse> abstractC44415lI6) {
        if (l == null) {
            C33694Ix2.m101454e(LOG_TAG, "The article id was null, can not create up vote", new Object[0]);
            if (abstractC44415lI6 != null) {
                abstractC44415lI6.onError(new C49968ug1("The article id was null, can not create up vote"));
                return;
            }
            return;
        }
        this.helpCenterService.upvoteArticle(l, str).mo1284E0(new ON4(abstractC44415lI6));
    }
}
