.class public final Lzendesk/messaging/MessagingActivityModule_DateProviderFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/messaging/MessagingActivityModule_DateProviderFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/messaging/components/DateProvider;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lzendesk/messaging/MessagingActivityModule_DateProviderFactory;
    .locals 1

    invoke-static {}, Lzendesk/messaging/MessagingActivityModule_DateProviderFactory$InstanceHolder;->access$000()Lzendesk/messaging/MessagingActivityModule_DateProviderFactory;

    move-result-object v0

    return-object v0
.end method

.method public static dateProvider()Lzendesk/messaging/components/DateProvider;
    .locals 1

    invoke-static {}, Lzendesk/messaging/MessagingActivityModule;->dateProvider()Lzendesk/messaging/components/DateProvider;

    move-result-object v0

    invoke-static {v0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/messaging/components/DateProvider;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/messaging/MessagingActivityModule_DateProviderFactory;->get()Lzendesk/messaging/components/DateProvider;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/messaging/components/DateProvider;
    .locals 1

    invoke-static {}, Lzendesk/messaging/MessagingActivityModule_DateProviderFactory;->dateProvider()Lzendesk/messaging/components/DateProvider;

    move-result-object v0

    return-object v0
.end method
