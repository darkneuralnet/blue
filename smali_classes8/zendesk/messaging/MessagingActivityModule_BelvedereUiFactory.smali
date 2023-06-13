.class public final Lzendesk/messaging/MessagingActivityModule_BelvedereUiFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/belvedere/b;",
        ">;"
    }
.end annotation


# instance fields
.field private final activityProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroidx/appcompat/app/AppCompatActivity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroidx/appcompat/app/AppCompatActivity;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingActivityModule_BelvedereUiFactory;->activityProvider:LY94;

    return-void
.end method

.method public static belvedereUi(Landroidx/appcompat/app/AppCompatActivity;)Lzendesk/belvedere/b;
    .locals 0

    invoke-static {p0}, Lzendesk/messaging/MessagingActivityModule;->belvedereUi(Landroidx/appcompat/app/AppCompatActivity;)Lzendesk/belvedere/b;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/belvedere/b;

    return-object p0
.end method

.method public static create(LY94;)Lzendesk/messaging/MessagingActivityModule_BelvedereUiFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroidx/appcompat/app/AppCompatActivity;",
            ">;)",
            "Lzendesk/messaging/MessagingActivityModule_BelvedereUiFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/messaging/MessagingActivityModule_BelvedereUiFactory;

    invoke-direct {v0, p0}, Lzendesk/messaging/MessagingActivityModule_BelvedereUiFactory;-><init>(LY94;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/messaging/MessagingActivityModule_BelvedereUiFactory;->get()Lzendesk/belvedere/b;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/belvedere/b;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/MessagingActivityModule_BelvedereUiFactory;->activityProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/app/AppCompatActivity;

    invoke-static {v0}, Lzendesk/messaging/MessagingActivityModule_BelvedereUiFactory;->belvedereUi(Landroidx/appcompat/app/AppCompatActivity;)Lzendesk/belvedere/b;

    move-result-object v0

    return-object v0
.end method
