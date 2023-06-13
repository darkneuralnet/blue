package zendesk.support;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ZendeskHelpCenterProvider implements HelpCenterProvider {
    private static final String EMPTY_JSON_BODY = "{}";
    private static final String LOG_TAG = "ZendeskHelpCenterProvider";
    private final HelpCenterBlipsProvider blipsProvider;
    private final ZendeskHelpCenterService helpCenterService;
    private final HelpCenterSessionCache helpCenterSessionCache;
    private final HelpCenterTracker helpCenterTracker;
    private final HelpCenterSettingsProvider settingsProvider;

    /* loaded from: classes8.dex */
    public static abstract class ZendeskCallbackSuccess<E> extends AbstractC44415lI6<E> {
        private final AbstractC44415lI6 callback;

        public ZendeskCallbackSuccess(AbstractC44415lI6 abstractC44415lI6) {
            this.callback = abstractC44415lI6;
        }

        @Override // p000.AbstractC44415lI6
        public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
            AbstractC44415lI6 abstractC44415lI6 = this.callback;
            if (abstractC44415lI6 != null) {
                abstractC44415lI6.onError(interfaceC48782sg1);
            }
        }

        @Override // p000.AbstractC44415lI6
        public abstract void onSuccess(E e);
    }

    public ZendeskHelpCenterProvider(HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, ZendeskHelpCenterService zendeskHelpCenterService, HelpCenterSessionCache helpCenterSessionCache, HelpCenterTracker helpCenterTracker) {
        this.settingsProvider = helpCenterSettingsProvider;
        this.blipsProvider = helpCenterBlipsProvider;
        this.helpCenterService = zendeskHelpCenterService;
        this.helpCenterSessionCache = helpCenterSessionCache;
        this.helpCenterTracker = helpCenterTracker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkSettingsAndVotingEnabled(AbstractC44415lI6<?> abstractC44415lI6, HelpCenterSettings helpCenterSettings) {
        if (!sanityCheckHelpCenterSettings(abstractC44415lI6, helpCenterSettings)) {
            if (helpCenterSettings.isArticleVotingEnabled()) {
                return true;
            }
            C33694Ix2.m101454e(LOG_TAG, "Help Center voting is disabled in your app's settings. Can not continue with the call", new Object[0]);
            if (abstractC44415lI6 != null) {
                abstractC44415lI6.onError(new C49968ug1("Help Center voting is disabled in your app's settings. Can not continue with the call"));
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HelpItem> convert(HelpResponse helpResponse) {
        if (helpResponse == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (CategoryItem categoryItem : helpResponse.getCategories()) {
            arrayList.add(categoryItem);
            for (SectionItem sectionItem : categoryItem.getSections()) {
                arrayList.add(sectionItem);
                arrayList.addAll(sectionItem.getChildren());
            }
        }
        return arrayList;
    }

    @SuppressLint({"UseSparseArrays"})
    public List<FlatArticle> asFlatArticleList(ArticlesResponse articlesResponse) {
        if (articlesResponse == null) {
            return new ArrayList();
        }
        List<Category> categories = articlesResponse.getCategories();
        List<Section> sections = articlesResponse.getSections();
        List<Article> articles = articlesResponse.getArticles();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        List<FlatArticle> arrayList = new ArrayList<>();
        if (C43505jm0.m29948i(articles)) {
            for (Category category : categories) {
                hashMap.put(category.getId(), category);
            }
            for (Section section : sections) {
                hashMap2.put(section.getId(), section);
            }
            for (Article article : articles) {
                Section section2 = (Section) hashMap2.get(article.getSectionId());
                arrayList.add(new FlatArticle((Category) hashMap.get(section2.getCategoryId()), section2, article));
            }
        } else {
            C33694Ix2.m101457b(LOG_TAG, "There are no articles contained in this account", new Object[0]);
            arrayList = Collections.emptyList();
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @SuppressLint({"UseSparseArrays"})
    public List<SearchArticle> asSearchArticleList(ArticlesResponse articlesResponse) {
        Section section;
        ArrayList arrayList = new ArrayList();
        if (articlesResponse == null) {
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        List<Article> m29952e = C43505jm0.m29952e(articlesResponse.getArticles());
        List<Section> m29952e2 = C43505jm0.m29952e(articlesResponse.getSections());
        List<Category> m29952e3 = C43505jm0.m29952e(articlesResponse.getCategories());
        List<zendesk.core.User> m29952e4 = C43505jm0.m29952e(articlesResponse.getUsers());
        for (Section section2 : m29952e2) {
            if (section2.getId() != null) {
                hashMap.put(section2.getId(), section2);
            }
        }
        for (Category category : m29952e3) {
            if (category.getId() != null) {
                hashMap2.put(category.getId(), category);
            }
        }
        for (zendesk.core.User user : m29952e4) {
            if (user.getId() != null) {
                hashMap3.put(user.getId(), user);
            }
        }
        for (Article article : m29952e) {
            Category category2 = null;
            if (article.getSectionId() != null) {
                section = (Section) hashMap.get(article.getSectionId());
            } else {
                C33694Ix2.m101447l(LOG_TAG, "Unable to determine section as section id was null.", new Object[0]);
                section = null;
            }
            if (section != null && section.getCategoryId() != null) {
                category2 = (Category) hashMap2.get(section.getCategoryId());
            } else {
                C33694Ix2.m101447l(LOG_TAG, "Unable to determine category as section was null.", new Object[0]);
            }
            if (article.getAuthorId() != null) {
                article.setAuthor((zendesk.core.User) hashMap3.get(article.getAuthorId()));
            } else {
                C33694Ix2.m101447l(LOG_TAG, "Unable to determine author as author id was null.", new Object[0]);
            }
            arrayList.add(new SearchArticle(article, section, category2));
        }
        return arrayList;
    }

    @Override // zendesk.support.HelpCenterProvider
    public void deleteVote(final Long l, final AbstractC44415lI6<Void> abstractC44415lI6) {
        if (sanityCheck(abstractC44415lI6, l)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.14
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.checkSettingsAndVotingEnabled(abstractC44415lI6, helpCenterSettings)) {
                    ZendeskHelpCenterProvider.this.helpCenterService.deleteVote(l, new ZendeskCallbackSuccess<Void>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.14.1
                        @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
                        public void onSuccess(Void r2) {
                            AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                            if (abstractC44415lI62 != null) {
                                abstractC44415lI62.onSuccess(r2);
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void downvoteArticle(final Long l, final AbstractC44415lI6<ArticleVote> abstractC44415lI6) {
        if (sanityCheck(abstractC44415lI6, l)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.13
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.checkSettingsAndVotingEnabled(abstractC44415lI6, helpCenterSettings)) {
                    ZendeskHelpCenterProvider.this.helpCenterService.downvoteArticle(l, ZendeskHelpCenterProvider.EMPTY_JSON_BODY, new ZendeskCallbackSuccess<ArticleVoteResponse>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.13.1
                        @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
                        public void onSuccess(ArticleVoteResponse articleVoteResponse) {
                            AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                            if (abstractC44415lI62 != null) {
                                abstractC44415lI62.onSuccess(articleVoteResponse.getVote());
                            }
                            ZendeskHelpCenterProvider.this.blipsProvider.articleVote(l, -1);
                        }
                    });
                }
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getArticle(final Long l, final AbstractC44415lI6<Article> abstractC44415lI6) {
        if (sanityCheck(abstractC44415lI6, l)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.8
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(abstractC44415lI6, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.getArticle(l, ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), "users", new ZendeskCallbackSuccess<Article>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.8.1
                    @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
                    public void onSuccess(Article article) {
                        ZendeskHelpCenterProvider.this.submitRecordArticleView(article, C32272Cv2.m111343c(article.getLocale()), new AbstractC44415lI6<Void>() { // from class: zendesk.support.ZendeskHelpCenterProvider.8.1.1
                            @Override // p000.AbstractC44415lI6
                            public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                                C33694Ix2.m101454e(ZendeskHelpCenterProvider.LOG_TAG, "Error submitting Help Center reporting: [reason] %s [isNetworkError] %s [status] %d", interfaceC48782sg1.mo9891c(), Boolean.valueOf(interfaceC48782sg1.mo9890d()), Integer.valueOf(interfaceC48782sg1.getStatus()));
                            }

                            @Override // p000.AbstractC44415lI6
                            public void onSuccess(Void r1) {
                            }
                        });
                        AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                        if (abstractC44415lI62 != null) {
                            abstractC44415lI62.onSuccess(article);
                        }
                    }
                });
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getArticles(Long l, AbstractC44415lI6<List<Article>> abstractC44415lI6) {
        getArticles(l, null, abstractC44415lI6);
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getAttachments(final Long l, final AttachmentType attachmentType, final AbstractC44415lI6<List<HelpCenterAttachment>> abstractC44415lI6) {
        if (sanityCheck(abstractC44415lI6, l, attachmentType)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.11
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(abstractC44415lI6, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.getAttachments(ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), l, attachmentType, abstractC44415lI6);
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getCategories(final AbstractC44415lI6<List<Category>> abstractC44415lI6) {
        if (sanityCheck(abstractC44415lI6, new Object[0])) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.2
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(abstractC44415lI6, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.getCategories(ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), abstractC44415lI6);
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getCategory(final Long l, final AbstractC44415lI6<Category> abstractC44415lI6) {
        if (sanityCheck(abstractC44415lI6, l)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.10
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(abstractC44415lI6, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.getCategoryById(l, ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), abstractC44415lI6);
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getHelp(final HelpRequest helpRequest, final AbstractC44415lI6<List<HelpItem>> abstractC44415lI6) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.1
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(abstractC44415lI6, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.getHelp(ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), helpRequest.getCategoryIds(), helpRequest.getSectionIds(), helpRequest.getIncludes(), helpRequest.getArticlesPerPageLimit(), C44504lS5.m27268g(helpRequest.getLabelNames()), new ZendeskCallbackSuccess<HelpResponse>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.1.1
                    @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
                    public void onSuccess(HelpResponse helpResponse) {
                        ZendeskHelpCenterProvider.this.helpCenterTracker.helpCenterLoaded();
                        C312591 c312591 = C312591.this;
                        AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                        if (abstractC44415lI62 != null) {
                            abstractC44415lI62.onSuccess(ZendeskHelpCenterProvider.this.convert(helpResponse));
                        }
                    }
                });
            }
        });
    }

    public Locale getLocale(HelpCenterSettings helpCenterSettings) {
        String str;
        Guide guide = Guide.INSTANCE;
        if (guide.getHelpCenterLocaleOverride() != null) {
            return guide.getHelpCenterLocaleOverride();
        }
        if (helpCenterSettings != null) {
            str = helpCenterSettings.getLocale();
        } else {
            str = "";
        }
        if (C44504lS5.m27271d(str)) {
            return Locale.getDefault();
        }
        return C32272Cv2.m111343c(str);
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getSection(final Long l, final AbstractC44415lI6<Section> abstractC44415lI6) {
        if (sanityCheck(abstractC44415lI6, l)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.9
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(abstractC44415lI6, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.getSectionById(l, ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), abstractC44415lI6);
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getSections(final Long l, final AbstractC44415lI6<List<Section>> abstractC44415lI6) {
        if (sanityCheck(abstractC44415lI6, l)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.3
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(abstractC44415lI6, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.getSectionsForCategory(l, ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), abstractC44415lI6);
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getSuggestedArticles(final SuggestedArticleSearch suggestedArticleSearch, final AbstractC44415lI6<Object> abstractC44415lI6) {
        if (sanityCheck(abstractC44415lI6, suggestedArticleSearch)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.15
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(abstractC44415lI6, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.getSuggestedArticles(suggestedArticleSearch.getQuery(), suggestedArticleSearch.getLocale() == null ? ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings) : suggestedArticleSearch.getLocale(), C44504lS5.m27271d(suggestedArticleSearch.getLabelNames()) ? null : C44504lS5.m27268g(suggestedArticleSearch.getLabelNames()), suggestedArticleSearch.getCategoryId(), suggestedArticleSearch.getSectionId(), abstractC44415lI6);
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void listArticles(final ListArticleQuery listArticleQuery, final AbstractC44415lI6<List<SearchArticle>> abstractC44415lI6) {
        if (sanityCheck(abstractC44415lI6, listArticleQuery)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.5
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                String include;
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(abstractC44415lI6, helpCenterSettings)) {
                    return;
                }
                if (listArticleQuery.getInclude() == null) {
                    include = C44504lS5.m27268g("categories", "sections", "users");
                } else {
                    include = listArticleQuery.getInclude();
                }
                String str = include;
                ZendeskHelpCenterProvider.this.helpCenterService.listArticles(C44504lS5.m27268g(listArticleQuery.getLabelNames()), listArticleQuery.getLocale() == null ? ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings) : listArticleQuery.getLocale(), str, (listArticleQuery.getSortBy() == null ? SortBy.CREATED_AT : listArticleQuery.getSortBy()).getApiValue(), (listArticleQuery.getSortOrder() == null ? SortOrder.DESCENDING : listArticleQuery.getSortOrder()).getApiValue(), listArticleQuery.getPage(), listArticleQuery.getResultsPerPage(), new ZendeskCallbackSuccess<ArticlesListResponse>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.5.1
                    @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
                    public void onSuccess(ArticlesListResponse articlesListResponse) {
                        List<SearchArticle> asSearchArticleList = ZendeskHelpCenterProvider.this.asSearchArticleList(articlesListResponse);
                        AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                        if (abstractC44415lI62 != null) {
                            abstractC44415lI62.onSuccess(asSearchArticleList);
                        }
                    }
                });
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void listArticlesFlat(final ListArticleQuery listArticleQuery, final AbstractC44415lI6<List<FlatArticle>> abstractC44415lI6) {
        if (sanityCheck(abstractC44415lI6, listArticleQuery)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.6
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(abstractC44415lI6, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.listArticles(C44504lS5.m27268g(listArticleQuery.getLabelNames()), listArticleQuery.getLocale() == null ? ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings) : listArticleQuery.getLocale(), "categories,sections", (listArticleQuery.getSortBy() == null ? SortBy.CREATED_AT : listArticleQuery.getSortBy()).getApiValue(), (listArticleQuery.getSortOrder() == null ? SortOrder.DESCENDING : listArticleQuery.getSortOrder()).getApiValue(), listArticleQuery.getPage(), listArticleQuery.getResultsPerPage(), new ZendeskCallbackSuccess<ArticlesListResponse>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.6.1
                    @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
                    public void onSuccess(ArticlesListResponse articlesListResponse) {
                        List<FlatArticle> asFlatArticleList = ZendeskHelpCenterProvider.this.asFlatArticleList(articlesListResponse);
                        AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                        if (abstractC44415lI62 != null) {
                            abstractC44415lI62.onSuccess(asFlatArticleList);
                        }
                    }
                });
            }
        });
    }

    public boolean sanityCheck(AbstractC44415lI6<?> abstractC44415lI6, Object... objArr) {
        if (objArr != null) {
            boolean z = true;
            for (Object obj : objArr) {
                if (obj == null) {
                    z = false;
                }
            }
            if (!z) {
                C33694Ix2.m101454e(LOG_TAG, "One or more provided parameters are null.", new Object[0]);
                if (abstractC44415lI6 != null) {
                    abstractC44415lI6.onError(new C49968ug1("One or more provided parameters are null."));
                }
                return true;
            }
        }
        return false;
    }

    public boolean sanityCheckHelpCenterSettings(AbstractC44415lI6<?> abstractC44415lI6, HelpCenterSettings helpCenterSettings) {
        if (helpCenterSettings == null) {
            C33694Ix2.m101454e(LOG_TAG, "Help Center settings are null. Can not continue with the call", new Object[0]);
            if (abstractC44415lI6 != null) {
                abstractC44415lI6.onError(new C49968ug1("Help Center settings are null. Can not continue with the call"));
            }
            return true;
        } else if (helpCenterSettings.isEnabled()) {
            return false;
        } else {
            C33694Ix2.m101454e(LOG_TAG, "Help Center is disabled in your app's settings. Can not continue with the call", new Object[0]);
            if (abstractC44415lI6 != null) {
                abstractC44415lI6.onError(new C49968ug1("Help Center is disabled in your app's settings. Can not continue with the call"));
            }
            return true;
        }
    }

    @Override // zendesk.support.HelpCenterProvider
    public void searchArticles(final HelpCenterSearch helpCenterSearch, final AbstractC44415lI6<List<SearchArticle>> abstractC44415lI6) {
        if (sanityCheck(abstractC44415lI6, helpCenterSearch)) {
            return;
        }
        this.blipsProvider.helpCenterSearch(helpCenterSearch.getQuery());
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.7
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                Locale locale;
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(abstractC44415lI6, helpCenterSettings)) {
                    return;
                }
                String m27268g = C44504lS5.m27271d(helpCenterSearch.getInclude()) ? C44504lS5.m27268g("categories", "sections", "users") : C44504lS5.m27268g(helpCenterSearch.getInclude());
                String m27268g2 = C44504lS5.m27271d(helpCenterSearch.getLabelNames()) ? null : C44504lS5.m27268g(helpCenterSearch.getLabelNames());
                if (helpCenterSearch.getLocale() == null) {
                    locale = ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings);
                } else {
                    locale = helpCenterSearch.getLocale();
                }
                ZendeskHelpCenterProvider.this.helpCenterService.searchArticles(helpCenterSearch.getQuery(), locale, m27268g, m27268g2, helpCenterSearch.getCategoryIds(), helpCenterSearch.getSectionIds(), helpCenterSearch.getPage(), helpCenterSearch.getPerPage(), new ZendeskCallbackSuccess<ArticlesSearchResponse>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.7.1
                    @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
                    public void onSuccess(ArticlesSearchResponse articlesSearchResponse) {
                        ZendeskHelpCenterProvider.this.helpCenterTracker.helpCenterSearched(helpCenterSearch.getQuery());
                        ZendeskHelpCenterProvider.this.helpCenterSessionCache.setLastSearch(helpCenterSearch.getQuery(), (articlesSearchResponse == null || !C43505jm0.m29948i(articlesSearchResponse.getArticles())) ? 0 : articlesSearchResponse.getArticles().size());
                        List<SearchArticle> asSearchArticleList = ZendeskHelpCenterProvider.this.asSearchArticleList(articlesSearchResponse);
                        AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                        if (abstractC44415lI62 != null) {
                            abstractC44415lI62.onSuccess(asSearchArticleList);
                        }
                    }
                });
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void submitRecordArticleView(final Article article, final Locale locale, final AbstractC44415lI6<Void> abstractC44415lI6) {
        if (sanityCheck(abstractC44415lI6, article)) {
            return;
        }
        this.helpCenterTracker.helpCenterArticleViewed();
        this.blipsProvider.articleView(article);
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.16
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(abstractC44415lI6, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.submitRecordArticleView(article.getId(), locale, new RecordArticleViewRequest(ZendeskHelpCenterProvider.this.helpCenterSessionCache.getLastSearch(), ZendeskHelpCenterProvider.this.helpCenterSessionCache.isUniqueSearchResultClick()), new ZendeskCallbackSuccess<Void>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.16.1
                    @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
                    public void onSuccess(Void r2) {
                        ZendeskHelpCenterProvider.this.helpCenterSessionCache.unsetUniqueSearchResultClick();
                        AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                        if (abstractC44415lI62 != null) {
                            abstractC44415lI62.onSuccess(r2);
                        }
                    }
                });
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void upvoteArticle(final Long l, final AbstractC44415lI6<ArticleVote> abstractC44415lI6) {
        if (sanityCheck(abstractC44415lI6, l)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.12
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.checkSettingsAndVotingEnabled(abstractC44415lI6, helpCenterSettings)) {
                    ZendeskHelpCenterProvider.this.helpCenterService.upvoteArticle(l, ZendeskHelpCenterProvider.EMPTY_JSON_BODY, new ZendeskCallbackSuccess<ArticleVoteResponse>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.12.1
                        @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
                        public void onSuccess(ArticleVoteResponse articleVoteResponse) {
                            AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                            if (abstractC44415lI62 != null) {
                                abstractC44415lI62.onSuccess(articleVoteResponse.getVote());
                            }
                            ZendeskHelpCenterProvider.this.blipsProvider.articleVote(l, 1);
                        }
                    });
                }
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getArticles(final Long l, final String str, final AbstractC44415lI6<List<Article>> abstractC44415lI6) {
        if (sanityCheck(abstractC44415lI6, l)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskHelpCenterProvider.4
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(abstractC44415lI6, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.getArticlesForSection(l, ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), "users", str, abstractC44415lI6);
            }
        });
    }
}
