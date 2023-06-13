package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AnonymousIdentity;
import zendesk.core.ApplicationConfiguration;
import zendesk.core.Identity;
import zendesk.core.NetworkAware;
import zendesk.core.NetworkInfoProvider;
import zendesk.core.UrlHelper;
import zendesk.core.Zendesk;
import zendesk.messaging.Engine;
import zendesk.messaging.MessagingActivity;
import zendesk.support.Article;
import zendesk.support.ArticleVoteStorage;
import zendesk.support.AttachmentType;
import zendesk.support.HelpCenterAttachment;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpCenterSettings;
import zendesk.support.HelpCenterSettingsProvider;
import zendesk.support.guide.ArticleConfiguration;
/* loaded from: classes8.dex */
public class ViewArticleActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private static final String ARTICLE_DETAIL_FORMAT_STRING = "%s %s <span dir=\"auto\">%s</span>";
    private static final String CSS_FILE = "file:///android_asset/help_center_article_style.css";
    private static final long FETCH_ATTACHMENTS_DELAY_MILLIS = 250;
    static final String LOG_TAG = "ViewArticleActivity";
    private static final Integer NETWORK_AWARE_ID = 57564;
    private static final String TYPE_TEXT_HTML = "text/html";
    private static final String UTF_8_ENCODING_TYPE = "UTF-8";
    ActionHandlerRegistry actionHandlerRegistry;
    private ArticleAttachmentAdapter adapter;
    ApplicationConfiguration applicationConfiguration;
    private ArticleViewModel article;
    private WebView articleContentWebView;
    private Long articleId;
    ArticleVoteStorage articleVoteStorage;
    private ArticleVotingView articleVotingView;
    private ListView attachmentListView;
    private C52353yh5<List<HelpCenterAttachment>> attachmentRequestCallback;
    private ArticleConfiguration config;
    C32054Bx0 configurationHelper;
    private CoordinatorLayout coordinatorLayout;
    private List<Engine> engines;
    HelpCenterProvider helpCenterProvider;
    NetworkInfoProvider networkInfoProvider;
    OkHttpClient okHttpClient;
    private ProgressBar progressView;
    HelpCenterSettingsProvider settingsProvider;
    private Snackbar snackbar;
    private final AggregatedCallback<HelpCenterSettings> settingsAggregatedCallback = new AggregatedCallback<>();
    private final Handler handler = new Handler();
    private final NetworkAware networkConnectionCallbacks = new NetworkAware() { // from class: zendesk.support.guide.ViewArticleActivity.6
        boolean connected = true;

        @Override // zendesk.core.NetworkAware
        public void onNetworkAvailable() {
            if (NetworkUtils.isConnectedOrConnecting(ViewArticleActivity.this)) {
                ViewArticleActivity.this.dimissSnackBar();
                this.connected = true;
                if (ViewArticleActivity.this.articleId != null && ViewArticleActivity.this.article == null) {
                    ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                    viewArticleActivity.fetchArticle(viewArticleActivity.articleId.longValue());
                } else if (ViewArticleActivity.this.article != null) {
                    ViewArticleActivity viewArticleActivity2 = ViewArticleActivity.this;
                    viewArticleActivity2.fetchAttachmentsForArticle(viewArticleActivity2.article.getId());
                }
            }
        }

        @Override // zendesk.core.NetworkAware
        @SuppressLint({"MissingPermission"})
        public void onNetworkUnavailable() {
            if (!NetworkUtils.isConnectedOrConnecting(ViewArticleActivity.this) && this.connected) {
                this.connected = false;
                ViewArticleActivity.this.dimissSnackBar();
                ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                viewArticleActivity.snackbar = Snackbar.m48856n0(viewArticleActivity.coordinatorLayout, C41127fl4.zg_general_no_connection_message, -2);
                ViewArticleActivity.this.snackbar.mo48864Y();
            }
        }
    };

    /* renamed from: zendesk.support.guide.ViewArticleActivity$8 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C313588 {

        /* renamed from: $SwitchMap$zendesk$support$guide$ViewArticleActivity$LoadingState */
        static final /* synthetic */ int[] f121966x84719a3e;

        static {
            int[] iArr = new int[LoadingState.values().length];
            f121966x84719a3e = iArr;
            try {
                iArr[LoadingState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f121966x84719a3e[LoadingState.DISPLAYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f121966x84719a3e[LoadingState.ERRORED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f121966x84719a3e[LoadingState.ERRORED_ATTACHMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class ArticleAttachmentAdapter extends ArrayAdapter<HelpCenterAttachment> {
        public ArticleAttachmentAdapter(Context context) {
            super(context, C52382yk4.zs_row_article_attachment);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            ArticleAttachmentRow articleAttachmentRow;
            if (view instanceof ArticleAttachmentRow) {
                articleAttachmentRow = (ArticleAttachmentRow) view;
            } else {
                articleAttachmentRow = new ArticleAttachmentRow(getContext());
            }
            articleAttachmentRow.bind((HelpCenterAttachment) getItem(i));
            return articleAttachmentRow;
        }
    }

    /* loaded from: classes8.dex */
    public static class ArticleAttachmentRow extends RelativeLayout {
        private final TextView fileName;
        private final TextView fileSize;

        public ArticleAttachmentRow(Context context) {
            super(context);
            View.inflate(context, C52382yk4.zs_row_article_attachment, this);
            this.fileName = (TextView) findViewById(C34497Mi4.article_attachment_row_filename_text);
            this.fileSize = (TextView) findViewById(C34497Mi4.article_attachment_row_filesize_text);
        }

        public void bind(HelpCenterAttachment helpCenterAttachment) {
            this.fileName.setText(helpCenterAttachment.getFileName());
            this.fileSize.setText(C50610vl1.m8197b(helpCenterAttachment.getSize()));
        }
    }

    /* loaded from: classes8.dex */
    public class AttachmentRequestCallback extends AbstractC44415lI6<List<HelpCenterAttachment>> {
        public AttachmentRequestCallback() {
        }

        @Override // p000.AbstractC44415lI6
        public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
            ViewArticleActivity.this.adapter.clear();
            ViewArticleActivity.this.setLoadingState(LoadingState.ERRORED_ATTACHMENT);
            C33694Ix2.m101456c(ViewArticleActivity.LOG_TAG, interfaceC48782sg1);
        }

        @Override // p000.AbstractC44415lI6
        public void onSuccess(List<HelpCenterAttachment> list) {
            ViewArticleActivity.this.adapter.clear();
            ViewArticleActivity.this.adapter.addAll(list);
            ViewArticleActivity.setListViewHeightBasedOnChildren(ViewArticleActivity.this.attachmentListView);
            ViewArticleActivity.this.setLoadingState(LoadingState.DISPLAYING);
        }
    }

    /* loaded from: classes8.dex */
    public enum LoadingState {
        LOADING,
        DISPLAYING,
        ERRORED,
        ERRORED_ATTACHMENT
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyVoteButtonSettings() {
        loadSettings(new AbstractC44415lI6<HelpCenterSettings>() { // from class: zendesk.support.guide.ViewArticleActivity.7
            @Override // p000.AbstractC44415lI6
            public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                ViewArticleActivity.this.articleVotingView.setVisibility(8);
            }

            @Override // p000.AbstractC44415lI6
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (helpCenterSettings.isArticleVotingEnabled()) {
                    ViewArticleActivity.this.articleVotingView.setVisibility(0);
                } else {
                    ViewArticleActivity.this.articleVotingView.setVisibility(8);
                }
            }
        });
    }

    public static ArticleConfiguration.Builder builder(Article article) {
        return new ArticleConfiguration.Builder(article);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dimissSnackBar() {
        Snackbar snackbar = this.snackbar;
        if (snackbar != null) {
            snackbar.mo48847x();
            this.snackbar = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fetchArticle(long j) {
        setLoadingState(LoadingState.LOADING);
        this.helpCenterProvider.getArticle(Long.valueOf(j), new AbstractC44415lI6<Article>() { // from class: zendesk.support.guide.ViewArticleActivity.3
            @Override // p000.AbstractC44415lI6
            public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                ViewArticleActivity.this.setLoadingState(LoadingState.ERRORED);
            }

            @Override // p000.AbstractC44415lI6
            public void onSuccess(Article article) {
                ViewArticleActivity.this.article = new ArticleViewModel(article);
                ViewArticleActivity.this.loadArticleBody();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fetchAttachmentsForArticle(long j) {
        setLoadingState(LoadingState.LOADING);
        this.helpCenterProvider.getAttachments(Long.valueOf(j), AttachmentType.BLOCK, this.attachmentRequestCallback);
    }

    private ActionBar initToolbar() {
        findViewById(C34497Mi4.view_article_compat_shadow).setVisibility(8);
        setSupportActionBar((Toolbar) findViewById(C34497Mi4.view_article_toolbar));
        return getSupportActionBar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    public void loadArticleBody() {
        String str;
        String str2;
        setTitle(getString(C41127fl4.zs_view_article_loaded_accessibility, this.article.getTitle()));
        setLoadingState(LoadingState.DISPLAYING);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(C31646Ad6.m115426a(this.article.getTitle()));
        }
        String authorName = this.article.getAuthorName();
        if (this.article.getCreatedAt() != null) {
            str = DateFormat.getDateInstance(1, C41243fx0.m40423a(getResources().getConfiguration()).m7771c(0)).format(this.article.getCreatedAt());
        } else {
            str = null;
        }
        if (str != null && authorName != null) {
            str2 = String.format(Locale.US, ARTICLE_DETAIL_FORMAT_STRING, authorName, getString(C41127fl4.view_article_seperator), str);
        } else {
            str2 = "";
        }
        this.articleContentWebView.loadDataWithBaseURL(this.applicationConfiguration.getZendeskUrl(), getString(C41127fl4.view_article_html_body, CSS_FILE, this.article.getTitle(), this.article.getBody(), str2), "text/html", "UTF-8", null);
        this.handler.postDelayed(new Runnable() { // from class: zendesk.support.guide.ViewArticleActivity.4
            @Override // java.lang.Runnable
            public void run() {
                ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                viewArticleActivity.fetchAttachmentsForArticle(viewArticleActivity.article.getId());
                ViewArticleActivity.this.applyVoteButtonSettings();
            }
        }, 250L);
    }

    private void loadSettings(AbstractC44415lI6<HelpCenterSettings> abstractC44415lI6) {
        if (this.settingsAggregatedCallback.add(abstractC44415lI6)) {
            this.settingsProvider.getSettings(this.settingsAggregatedCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter == null) {
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 0);
        View view = null;
        int i = 0;
        for (int i2 = 0; i2 < adapter.getCount(); i2++) {
            view = adapter.getView(i2, view, listView);
            if (i2 == 0) {
                view.setLayoutParams(new ViewGroup.LayoutParams(makeMeasureSpec, -2));
            }
            view.measure(makeMeasureSpec, 0);
            i += view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
        layoutParams.height = i + (listView.getDividerHeight() * (adapter.getCount() - 1));
        listView.setLayoutParams(layoutParams);
        listView.requestLayout();
    }

    private void setupRequestInterceptor() {
        WebView webView = this.articleContentWebView;
        if (webView == null) {
            C33694Ix2.m101447l(LOG_TAG, "The webview is null. Make sure you initialise it before trying to add the interceptor", new Object[0]);
        } else {
            webView.setWebViewClient(new WebViewClient() { // from class: zendesk.support.guide.ViewArticleActivity.2
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v10, types: [java.io.InputStream] */
                /* JADX WARN: Type inference failed for: r0v14 */
                @Override // android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView2, String str) {
                    InputStream inputStream;
                    String str2;
                    InputStream inputStream2;
                    String str3;
                    String zendeskUrl = ViewArticleActivity.this.applicationConfiguration.getZendeskUrl();
                    if (!C44504lS5.m27271d(zendeskUrl) && str.startsWith(zendeskUrl)) {
                        Identity identity = Zendesk.INSTANCE.getIdentity();
                        if (UrlHelper.isGuideRequest(str) && (identity instanceof AnonymousIdentity)) {
                            C33694Ix2.m101447l(ViewArticleActivity.LOG_TAG, "Will not intercept request because it is anonymous guide request", new Object[0]);
                            return super.shouldInterceptRequest(webView2, str);
                        }
                        String str4 = null;
                        try {
                            Response execute = FirebasePerfOkHttpClient.execute(ViewArticleActivity.this.okHttpClient.newCall(new Request.Builder().url(str).build()));
                            if (execute != null && execute.isSuccessful() && execute.body() != null) {
                                inputStream = execute.body().byteStream();
                                try {
                                    MediaType contentType = execute.body().contentType();
                                    if (contentType != null) {
                                        if (C44504lS5.m27273b(contentType.type()) && C44504lS5.m27273b(contentType.subtype())) {
                                            str2 = String.format(Locale.US, "%s/%s", contentType.type(), contentType.subtype());
                                        } else {
                                            str2 = null;
                                        }
                                        try {
                                            Charset charset = contentType.charset();
                                            if (charset != null) {
                                                str4 = charset.name();
                                            }
                                            str3 = str4;
                                        } catch (Exception e) {
                                            e = e;
                                            C33694Ix2.m101455d(ViewArticleActivity.LOG_TAG, "Exception encountered when trying to intercept request", e, new Object[0]);
                                            inputStream2 = inputStream;
                                            return new WebResourceResponse(str2, str4, inputStream2);
                                        }
                                    } else {
                                        str3 = null;
                                        str2 = null;
                                    }
                                    str4 = inputStream;
                                } catch (Exception e2) {
                                    e = e2;
                                    str2 = null;
                                }
                            } else {
                                str3 = null;
                                str2 = null;
                            }
                            inputStream2 = str4;
                            str4 = str3;
                        } catch (Exception e3) {
                            e = e3;
                            inputStream = null;
                            str2 = null;
                        }
                        return new WebResourceResponse(str2, str4, inputStream2);
                    }
                    C33694Ix2.m101447l(ViewArticleActivity.LOG_TAG, "Will not intercept request because the url is not hosted by Zendesk" + str, new Object[0]);
                    return super.shouldInterceptRequest(webView2, str);
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                    ActionHandler handlerByAction = ViewArticleActivity.this.actionHandlerRegistry.handlerByAction(str);
                    if (handlerByAction != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("help_center_view_article", str);
                        ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                        viewArticleActivity.configurationHelper.m113277d(hashMap, viewArticleActivity.config);
                        handlerByAction.handle(hashMap, ViewArticleActivity.this);
                        return true;
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    if (intent.resolveActivity(webView2.getContext().getPackageManager()) != null) {
                        webView2.getContext().startActivity(intent);
                        return true;
                    }
                    C33694Ix2.m101457b(ViewArticleActivity.LOG_TAG, "No browser available to open url: " + str, new Object[0]);
                    return false;
                }
            });
        }
    }

    private boolean shouldShowContactUsButton() {
        boolean z;
        if (this.actionHandlerRegistry.handlerByAction("action_contact_option") != null) {
            z = true;
        } else {
            z = false;
        }
        boolean m29948i = C43505jm0.m29948i(this.engines);
        if (this.config.isContactUsButtonVisible() && (z || m29948i)) {
            return true;
        }
        return false;
    }

    private void showCreateRequest(Map<String, Object> map) {
        String simpleName;
        ActionHandler handlerByAction = this.actionHandlerRegistry.handlerByAction("action_contact_option");
        if (handlerByAction != null) {
            ActionDescription actionDescription = handlerByAction.getActionDescription();
            if (actionDescription != null) {
                simpleName = actionDescription.getLocalizedLabel();
            } else {
                simpleName = handlerByAction.getClass().getSimpleName();
            }
            C33694Ix2.m101457b(LOG_TAG, "No Deflection ActionHandler Available, opening %s", simpleName);
            handlerByAction.handle(map, this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled", "RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getTheme().applyStyle(C51799xl4.ZendeskActivityDefaultTheme, true);
        setContentView(C52382yk4.zs_activity_view_article);
        GuideSdkDependencyProvider guideSdkDependencyProvider = GuideSdkDependencyProvider.INSTANCE;
        if (!guideSdkDependencyProvider.isInitialized()) {
            C33694Ix2.m101454e(LOG_TAG, GuideSdkDependencyProvider.NOT_INITIALIZED_LOG, new Object[0]);
            finish();
            return;
        }
        guideSdkDependencyProvider.provideGuideSdkComponent().inject(this);
        ActionBar initToolbar = initToolbar();
        ArticleConfiguration articleConfiguration = (ArticleConfiguration) this.configurationHelper.m113275f(getIntent().getExtras(), ArticleConfiguration.class);
        this.config = articleConfiguration;
        if (articleConfiguration != null && articleConfiguration.getConfigurationState() != -1) {
            this.engines = this.config.getEngines();
            this.attachmentListView = (ListView) findViewById(C34497Mi4.view_article_attachment_list);
            ArticleAttachmentAdapter articleAttachmentAdapter = new ArticleAttachmentAdapter(this);
            this.adapter = articleAttachmentAdapter;
            this.attachmentListView.setAdapter((ListAdapter) articleAttachmentAdapter);
            this.attachmentListView.setOnItemClickListener(this);
            if (initToolbar != null) {
                initToolbar.mo70212v(true);
            }
            WebView webView = (WebView) findViewById(C34497Mi4.view_article_content_webview);
            this.articleContentWebView = webView;
            webView.setWebChromeClient(new WebChromeClient());
            this.articleContentWebView.getSettings().setJavaScriptEnabled(true);
            setupRequestInterceptor();
            this.articleContentWebView.getSettings().setMixedContentMode(0);
            this.progressView = (ProgressBar) findViewById(C34497Mi4.view_article_progress);
            this.coordinatorLayout = (CoordinatorLayout) findViewById(C34497Mi4.view_article_attachment_coordinator);
            if (this.config.getConfigurationState() == 2) {
                ArticleViewModel article = this.config.getArticle();
                this.article = article;
                if (article != null) {
                    this.articleId = Long.valueOf(article.getId());
                }
                loadArticleBody();
            } else {
                fetchArticle(this.config.getArticleId());
                this.articleId = Long.valueOf(this.config.getArticleId());
            }
            if (shouldShowContactUsButton()) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(C34497Mi4.contact_us_button);
                floatingActionButton.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.guide.ViewArticleActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ViewArticleActivity.this.showContactZendesk();
                    }
                });
                floatingActionButton.setVisibility(0);
            }
            ArticleVotingView articleVotingView = (ArticleVotingView) findViewById(C34497Mi4.article_voting_container);
            this.articleVotingView = articleVotingView;
            articleVotingView.bindTo(this.articleId, this.articleVoteStorage, this.helpCenterProvider);
            this.articleVotingView.setVisibility(8);
            applyVoteButtonSettings();
            return;
        }
        C33694Ix2.m101454e(LOG_TAG, "No configuration found. Please use ViewArticleActivity.builder()", new Object[0]);
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.settingsAggregatedCallback.cancel();
        WebView webView = this.articleContentWebView;
        if (webView != null) {
            webView.destroy();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object itemAtPosition = adapterView.getItemAtPosition(i);
        if (itemAtPosition instanceof HelpCenterAttachment) {
            HelpCenterAttachment helpCenterAttachment = (HelpCenterAttachment) itemAtPosition;
            if (helpCenterAttachment.getContentUrl() != null) {
                Uri parse = Uri.parse(helpCenterAttachment.getContentUrl());
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(parse);
                startActivity(intent);
                return;
            }
            C33694Ix2.m101447l(LOG_TAG, "Unable to launch viewer, unable to parse URI for attachment", new Object[0]);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.attachmentRequestCallback = C52353yh5.m2896a(new AttachmentRequestCallback());
        this.networkInfoProvider.addNetworkAwareListener(NETWORK_AWARE_ID, this.networkConnectionCallbacks);
        this.networkInfoProvider.register();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        C52353yh5<List<HelpCenterAttachment>> c52353yh5 = this.attachmentRequestCallback;
        if (c52353yh5 != null) {
            c52353yh5.cancel();
            this.attachmentRequestCallback = null;
        }
        this.networkInfoProvider.removeNetworkAwareListener(NETWORK_AWARE_ID);
        this.networkInfoProvider.unregister();
    }

    public void setLoadingState(LoadingState loadingState) {
        if (loadingState == null) {
            C33694Ix2.m101447l(LOG_TAG, "LoadingState was null, nothing to do", new Object[0]);
            return;
        }
        int i = C313588.f121966x84719a3e[loadingState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        showLoadingErrorState(C41127fl4.view_article_attachments_error);
                        return;
                    }
                    return;
                }
                showLoadingErrorState(C41127fl4.zs_view_article_error);
                return;
            }
            C31646Ad6.m115423d(this.progressView, 8);
            C31646Ad6.m115423d(this.attachmentListView, 0);
            return;
        }
        C31646Ad6.m115423d(this.progressView, 0);
        C31646Ad6.m115423d(this.attachmentListView, 8);
    }

    public void showContactZendesk() {
        HashMap hashMap = new HashMap();
        this.configurationHelper.m113277d(hashMap, this.config);
        if (C43505jm0.m29948i(this.engines)) {
            MessagingActivity.builder().withEngines(this.engines).show(this, this.config.getConfigurations());
        } else {
            showCreateRequest(hashMap);
        }
    }

    public void showLoadingErrorState(int i) {
        C31646Ad6.m115423d(this.progressView, 8);
        C31646Ad6.m115423d(this.attachmentListView, 8);
        dimissSnackBar();
        Snackbar m48853q0 = Snackbar.m48856n0(this.coordinatorLayout, i, -2).m48853q0(C41127fl4.zui_retry_button_label, new View.OnClickListener() { // from class: zendesk.support.guide.ViewArticleActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ViewArticleActivity.this.articleId != null && ViewArticleActivity.this.article == null) {
                    ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                    viewArticleActivity.fetchArticle(viewArticleActivity.articleId.longValue());
                } else if (ViewArticleActivity.this.article != null) {
                    ViewArticleActivity viewArticleActivity2 = ViewArticleActivity.this;
                    viewArticleActivity2.fetchAttachmentsForArticle(viewArticleActivity2.article.getId());
                }
                ViewArticleActivity.this.dimissSnackBar();
            }
        });
        this.snackbar = m48853q0;
        m48853q0.mo48864Y();
    }

    public static ArticleConfiguration.Builder builder(long j) {
        return new ArticleConfiguration.Builder(j);
    }

    public static ArticleConfiguration.Builder builder() {
        return new ArticleConfiguration.Builder();
    }
}
