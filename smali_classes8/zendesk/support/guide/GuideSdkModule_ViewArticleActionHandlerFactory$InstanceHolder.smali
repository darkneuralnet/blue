.class final Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory$InstanceHolder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "InstanceHolder"
.end annotation


# static fields
.field private static final INSTANCE:Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory;

    invoke-direct {v0}, Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory;-><init>()V

    sput-object v0, Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory$InstanceHolder;->INSTANCE:Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic access$000()Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory;
    .locals 1

    sget-object v0, Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory$InstanceHolder;->INSTANCE:Lzendesk/support/guide/GuideSdkModule_ViewArticleActionHandlerFactory;

    return-object v0
.end method
