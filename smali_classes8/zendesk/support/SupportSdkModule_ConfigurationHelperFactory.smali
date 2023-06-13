.class public final Lzendesk/support/SupportSdkModule_ConfigurationHelperFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LBx0;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lzendesk/support/SupportSdkModule;


# direct methods
.method public constructor <init>(Lzendesk/support/SupportSdkModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/SupportSdkModule_ConfigurationHelperFactory;->module:Lzendesk/support/SupportSdkModule;

    return-void
.end method

.method public static configurationHelper(Lzendesk/support/SupportSdkModule;)LBx0;
    .locals 0

    invoke-virtual {p0}, Lzendesk/support/SupportSdkModule;->configurationHelper()LBx0;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LBx0;

    return-object p0
.end method

.method public static create(Lzendesk/support/SupportSdkModule;)Lzendesk/support/SupportSdkModule_ConfigurationHelperFactory;
    .locals 1

    new-instance v0, Lzendesk/support/SupportSdkModule_ConfigurationHelperFactory;

    invoke-direct {v0, p0}, Lzendesk/support/SupportSdkModule_ConfigurationHelperFactory;-><init>(Lzendesk/support/SupportSdkModule;)V

    return-object v0
.end method


# virtual methods
.method public get()LBx0;
    .locals 1

    iget-object v0, p0, Lzendesk/support/SupportSdkModule_ConfigurationHelperFactory;->module:Lzendesk/support/SupportSdkModule;

    invoke-static {v0}, Lzendesk/support/SupportSdkModule_ConfigurationHelperFactory;->configurationHelper(Lzendesk/support/SupportSdkModule;)LBx0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/SupportSdkModule_ConfigurationHelperFactory;->get()LBx0;

    move-result-object v0

    return-object v0
.end method
