.class public final Lzendesk/messaging/ui/MessagingCellPropsFactory_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/messaging/ui/MessagingCellPropsFactory;",
        ">;"
    }
.end annotation


# instance fields
.field private final resourcesProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/res/Resources;",
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
            "Landroid/content/res/Resources;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/ui/MessagingCellPropsFactory_Factory;->resourcesProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lzendesk/messaging/ui/MessagingCellPropsFactory_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lzendesk/messaging/ui/MessagingCellPropsFactory_Factory;"
        }
    .end annotation

    new-instance v0, Lzendesk/messaging/ui/MessagingCellPropsFactory_Factory;

    invoke-direct {v0, p0}, Lzendesk/messaging/ui/MessagingCellPropsFactory_Factory;-><init>(LY94;)V

    return-object v0
.end method

.method public static newInstance(Landroid/content/res/Resources;)Lzendesk/messaging/ui/MessagingCellPropsFactory;
    .locals 1

    new-instance v0, Lzendesk/messaging/ui/MessagingCellPropsFactory;

    invoke-direct {v0, p0}, Lzendesk/messaging/ui/MessagingCellPropsFactory;-><init>(Landroid/content/res/Resources;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/messaging/ui/MessagingCellPropsFactory_Factory;->get()Lzendesk/messaging/ui/MessagingCellPropsFactory;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/messaging/ui/MessagingCellPropsFactory;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/MessagingCellPropsFactory_Factory;->resourcesProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/res/Resources;

    invoke-static {v0}, Lzendesk/messaging/ui/MessagingCellPropsFactory_Factory;->newInstance(Landroid/content/res/Resources;)Lzendesk/messaging/ui/MessagingCellPropsFactory;

    move-result-object v0

    return-object v0
.end method
