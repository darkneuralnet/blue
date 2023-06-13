.class Lzendesk/support/RecordArticleViewRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private lastSearch:Lzendesk/support/LastSearch;

.field private uniqueSearchResultClick:Z


# direct methods
.method public constructor <init>(Lzendesk/support/LastSearch;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/RecordArticleViewRequest;->lastSearch:Lzendesk/support/LastSearch;

    iput-boolean p2, p0, Lzendesk/support/RecordArticleViewRequest;->uniqueSearchResultClick:Z

    return-void
.end method
