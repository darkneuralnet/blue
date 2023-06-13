.class final Lzendesk/core/ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory$InstanceHolder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/core/ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "InstanceHolder"
.end annotation


# static fields
.field private static final INSTANCE:Lzendesk/core/ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzendesk/core/ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory;

    invoke-direct {v0}, Lzendesk/core/ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory;-><init>()V

    sput-object v0, Lzendesk/core/ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory$InstanceHolder;->INSTANCE:Lzendesk/core/ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic access$000()Lzendesk/core/ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory;
    .locals 1

    sget-object v0, Lzendesk/core/ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory$InstanceHolder;->INSTANCE:Lzendesk/core/ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory;

    return-object v0
.end method
