.class public final Lzendesk/messaging/MessagingDialog_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/messaging/MessagingDialog;",
        ">;"
    }
.end annotation


# instance fields
.field private final appCompatActivityProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroidx/appcompat/app/AppCompatActivity;",
            ">;"
        }
    .end annotation
.end field

.field private final dateProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/components/DateProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final messagingViewModelProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/MessagingViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroidx/appcompat/app/AppCompatActivity;",
            ">;",
            "LY94<",
            "Lzendesk/messaging/MessagingViewModel;",
            ">;",
            "LY94<",
            "Lzendesk/messaging/components/DateProvider;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingDialog_Factory;->appCompatActivityProvider:LY94;

    iput-object p2, p0, Lzendesk/messaging/MessagingDialog_Factory;->messagingViewModelProvider:LY94;

    iput-object p3, p0, Lzendesk/messaging/MessagingDialog_Factory;->dateProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;)Lzendesk/messaging/MessagingDialog_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroidx/appcompat/app/AppCompatActivity;",
            ">;",
            "LY94<",
            "Lzendesk/messaging/MessagingViewModel;",
            ">;",
            "LY94<",
            "Lzendesk/messaging/components/DateProvider;",
            ">;)",
            "Lzendesk/messaging/MessagingDialog_Factory;"
        }
    .end annotation

    new-instance v0, Lzendesk/messaging/MessagingDialog_Factory;

    invoke-direct {v0, p0, p1, p2}, Lzendesk/messaging/MessagingDialog_Factory;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Landroidx/appcompat/app/AppCompatActivity;Lzendesk/messaging/MessagingViewModel;Lzendesk/messaging/components/DateProvider;)Lzendesk/messaging/MessagingDialog;
    .locals 1

    new-instance v0, Lzendesk/messaging/MessagingDialog;

    invoke-direct {v0, p0, p1, p2}, Lzendesk/messaging/MessagingDialog;-><init>(Landroidx/appcompat/app/AppCompatActivity;Lzendesk/messaging/MessagingViewModel;Lzendesk/messaging/components/DateProvider;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/messaging/MessagingDialog_Factory;->get()Lzendesk/messaging/MessagingDialog;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/messaging/MessagingDialog;
    .locals 3

    iget-object v0, p0, Lzendesk/messaging/MessagingDialog_Factory;->appCompatActivityProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/app/AppCompatActivity;

    iget-object v1, p0, Lzendesk/messaging/MessagingDialog_Factory;->messagingViewModelProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/messaging/MessagingViewModel;

    iget-object v2, p0, Lzendesk/messaging/MessagingDialog_Factory;->dateProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzendesk/messaging/components/DateProvider;

    invoke-static {v0, v1, v2}, Lzendesk/messaging/MessagingDialog_Factory;->newInstance(Landroidx/appcompat/app/AppCompatActivity;Lzendesk/messaging/MessagingViewModel;Lzendesk/messaging/components/DateProvider;)Lzendesk/messaging/MessagingDialog;

    move-result-object v0

    return-object v0
.end method
