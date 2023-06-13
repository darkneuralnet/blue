.class public final Lzendesk/support/SupportApplicationModule_ProvidesZendeskTrackerFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/support/ZendeskTracker;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lzendesk/support/SupportApplicationModule;


# direct methods
.method public constructor <init>(Lzendesk/support/SupportApplicationModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/SupportApplicationModule_ProvidesZendeskTrackerFactory;->module:Lzendesk/support/SupportApplicationModule;

    return-void
.end method

.method public static create(Lzendesk/support/SupportApplicationModule;)Lzendesk/support/SupportApplicationModule_ProvidesZendeskTrackerFactory;
    .locals 1

    new-instance v0, Lzendesk/support/SupportApplicationModule_ProvidesZendeskTrackerFactory;

    invoke-direct {v0, p0}, Lzendesk/support/SupportApplicationModule_ProvidesZendeskTrackerFactory;-><init>(Lzendesk/support/SupportApplicationModule;)V

    return-object v0
.end method

.method public static providesZendeskTracker(Lzendesk/support/SupportApplicationModule;)Lzendesk/support/ZendeskTracker;
    .locals 0

    invoke-virtual {p0}, Lzendesk/support/SupportApplicationModule;->providesZendeskTracker()Lzendesk/support/ZendeskTracker;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/ZendeskTracker;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/SupportApplicationModule_ProvidesZendeskTrackerFactory;->get()Lzendesk/support/ZendeskTracker;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/support/ZendeskTracker;
    .locals 1

    iget-object v0, p0, Lzendesk/support/SupportApplicationModule_ProvidesZendeskTrackerFactory;->module:Lzendesk/support/SupportApplicationModule;

    invoke-static {v0}, Lzendesk/support/SupportApplicationModule_ProvidesZendeskTrackerFactory;->providesZendeskTracker(Lzendesk/support/SupportApplicationModule;)Lzendesk/support/ZendeskTracker;

    move-result-object v0

    return-object v0
.end method
