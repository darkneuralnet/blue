.class Lzendesk/messaging/ui/ArticlesResponseView$ArticleSuggestionViewState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/messaging/ui/ArticlesResponseView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ArticleSuggestionViewState"
.end annotation


# instance fields
.field private final onArticleSuggestionSelectionListener:Lzendesk/messaging/ui/OnArticleSuggestionSelectionListener;

.field private final snippet:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lzendesk/messaging/ui/OnArticleSuggestionSelectionListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/ui/ArticlesResponseView$ArticleSuggestionViewState;->title:Ljava/lang/String;

    iput-object p2, p0, Lzendesk/messaging/ui/ArticlesResponseView$ArticleSuggestionViewState;->snippet:Ljava/lang/String;

    iput-object p3, p0, Lzendesk/messaging/ui/ArticlesResponseView$ArticleSuggestionViewState;->onArticleSuggestionSelectionListener:Lzendesk/messaging/ui/OnArticleSuggestionSelectionListener;

    return-void
.end method


# virtual methods
.method public getOnArticleSuggestionSelectionListener()Lzendesk/messaging/ui/OnArticleSuggestionSelectionListener;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/ArticlesResponseView$ArticleSuggestionViewState;->onArticleSuggestionSelectionListener:Lzendesk/messaging/ui/OnArticleSuggestionSelectionListener;

    return-object v0
.end method

.method public getSnippet()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/ArticlesResponseView$ArticleSuggestionViewState;->snippet:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/ArticlesResponseView$ArticleSuggestionViewState;->title:Ljava/lang/String;

    return-object v0
.end method
