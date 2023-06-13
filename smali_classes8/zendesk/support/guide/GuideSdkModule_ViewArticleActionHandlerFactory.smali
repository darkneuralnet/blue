.class public final Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/core/ActionHandler;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory;
    .locals 1

    invoke-static {}, Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory$InstanceHolder;->access$000()Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory;

    move-result-object v0

    return-object v0
.end method

.method public static viewArticleActionHandler()Lzendesk/core/ActionHandler;
    .locals 1

    invoke-static {}, Lzendesk/support/guide/GuideSdkModule;->viewArticleActionHandler()Lzendesk/core/ActionHandler;

    move-result-object v0

    invoke-static {v0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/core/ActionHandler;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory;->get()Lzendesk/core/ActionHandler;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/core/ActionHandler;
    .locals 1

    invoke-static {}, Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory;->viewArticleActionHandler()Lzendesk/core/ActionHandler;

    move-result-object v0

    return-object v0
.end method
