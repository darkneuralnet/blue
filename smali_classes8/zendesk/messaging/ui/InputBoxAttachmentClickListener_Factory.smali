.class public final Lzendesk/messaging/ui/InputBoxAttachmentClickListener_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/messaging/ui/InputBoxAttachmentClickListener;",
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

.field private final belvedereMediaHolderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/BelvedereMediaHolder;",
            ">;"
        }
    .end annotation
.end field

.field private final imageStreamProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/belvedere/b;",
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
            "Lzendesk/belvedere/b;",
            ">;",
            "LY94<",
            "Lzendesk/messaging/BelvedereMediaHolder;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/ui/InputBoxAttachmentClickListener_Factory;->activityProvider:LY94;

    iput-object p2, p0, Lzendesk/messaging/ui/InputBoxAttachmentClickListener_Factory;->imageStreamProvider:LY94;

    iput-object p3, p0, Lzendesk/messaging/ui/InputBoxAttachmentClickListener_Factory;->belvedereMediaHolderProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;)Lzendesk/messaging/ui/InputBoxAttachmentClickListener_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroidx/appcompat/app/AppCompatActivity;",
            ">;",
            "LY94<",
            "Lzendesk/belvedere/b;",
            ">;",
            "LY94<",
            "Lzendesk/messaging/BelvedereMediaHolder;",
            ">;)",
            "Lzendesk/messaging/ui/InputBoxAttachmentClickListener_Factory;"
        }
    .end annotation

    new-instance v0, Lzendesk/messaging/ui/InputBoxAttachmentClickListener_Factory;

    invoke-direct {v0, p0, p1, p2}, Lzendesk/messaging/ui/InputBoxAttachmentClickListener_Factory;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Landroidx/appcompat/app/AppCompatActivity;Lzendesk/belvedere/b;Lzendesk/messaging/BelvedereMediaHolder;)Lzendesk/messaging/ui/InputBoxAttachmentClickListener;
    .locals 1

    new-instance v0, Lzendesk/messaging/ui/InputBoxAttachmentClickListener;

    invoke-direct {v0, p0, p1, p2}, Lzendesk/messaging/ui/InputBoxAttachmentClickListener;-><init>(Landroidx/appcompat/app/AppCompatActivity;Lzendesk/belvedere/b;Lzendesk/messaging/BelvedereMediaHolder;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/messaging/ui/InputBoxAttachmentClickListener_Factory;->get()Lzendesk/messaging/ui/InputBoxAttachmentClickListener;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/messaging/ui/InputBoxAttachmentClickListener;
    .locals 3

    iget-object v0, p0, Lzendesk/messaging/ui/InputBoxAttachmentClickListener_Factory;->activityProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/app/AppCompatActivity;

    iget-object v1, p0, Lzendesk/messaging/ui/InputBoxAttachmentClickListener_Factory;->imageStreamProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/belvedere/b;

    iget-object v2, p0, Lzendesk/messaging/ui/InputBoxAttachmentClickListener_Factory;->belvedereMediaHolderProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzendesk/messaging/BelvedereMediaHolder;

    invoke-static {v0, v1, v2}, Lzendesk/messaging/ui/InputBoxAttachmentClickListener_Factory;->newInstance(Landroidx/appcompat/app/AppCompatActivity;Lzendesk/belvedere/b;Lzendesk/messaging/BelvedereMediaHolder;)Lzendesk/messaging/ui/InputBoxAttachmentClickListener;

    move-result-object v0

    return-object v0
.end method
