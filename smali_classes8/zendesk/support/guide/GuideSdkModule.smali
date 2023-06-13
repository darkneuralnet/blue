.class Lzendesk/support/guide/GuideSdkModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static viewArticleActionHandler()Lzendesk/core/ActionHandler;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    new-instance v0, Lzendesk/support/guide/ViewArticleActionHandler;

    invoke-direct {v0}, Lzendesk/support/guide/ViewArticleActionHandler;-><init>()V

    return-object v0
.end method


# virtual methods
.method public configurationHelper()LBx0;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    new-instance v0, LBx0;

    invoke-direct {v0}, LBx0;-><init>()V

    return-object v0
.end method
