.class Lzendesk/messaging/ui/MessagePopUpHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/messaging/ui/MessagePopUpHelper$Option;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static createOnMenuItemClickListener(Lzendesk/messaging/ui/MessageActionListener;Ljava/lang/String;)LxY3$c;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lzendesk/messaging/ui/MessagePopUpHelper$1;

    invoke-direct {v0, p0, p1}, Lzendesk/messaging/ui/MessagePopUpHelper$1;-><init>(Lzendesk/messaging/ui/MessageActionListener;Ljava/lang/String;)V

    return-object v0
.end method

.method private static createPopUpMenu(Landroid/view/View;ILxY3$c;)LxY3;
    .locals 2

    new-instance v0, LxY3;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0}, LxY3;-><init>(Landroid/content/Context;Landroid/view/View;)V

    invoke-virtual {v0, p1}, LxY3;->c(I)V

    invoke-virtual {v0, p2}, LxY3;->e(LxY3$c;)V

    const p0, 0x800005

    invoke-virtual {v0, p0}, LxY3;->d(I)V

    return-object v0
.end method

.method public static showPopUpMenu(Landroid/view/View;Ljava/util/Set;Lzendesk/messaging/ui/MessageActionListener;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/Set<",
            "Lzendesk/messaging/ui/MessagePopUpHelper$Option;",
            ">;",
            "Lzendesk/messaging/ui/MessageActionListener;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-static {p2, p3}, Lzendesk/messaging/ui/MessagePopUpHelper;->createOnMenuItemClickListener(Lzendesk/messaging/ui/MessageActionListener;Ljava/lang/String;)LxY3$c;

    move-result-object p2

    sget p3, Lzendesk/messaging/R$menu;->zui_message_options_copy_retry_delete:I

    invoke-static {p0, p3, p2}, Lzendesk/messaging/ui/MessagePopUpHelper;->createPopUpMenu(Landroid/view/View;ILxY3$c;)LxY3;

    move-result-object p0

    invoke-virtual {p0}, LxY3;->a()Landroid/view/Menu;

    move-result-object p2

    const/4 p3, 0x0

    invoke-interface {p2, p3}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object p2

    sget-object p3, Lzendesk/messaging/ui/MessagePopUpHelper$Option;->COPY:Lzendesk/messaging/ui/MessagePopUpHelper$Option;

    invoke-interface {p1, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2, p3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-virtual {p0}, LxY3;->a()Landroid/view/Menu;

    move-result-object p2

    const/4 p3, 0x1

    invoke-interface {p2, p3}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object p2

    sget-object p3, Lzendesk/messaging/ui/MessagePopUpHelper$Option;->RETRY:Lzendesk/messaging/ui/MessagePopUpHelper$Option;

    invoke-interface {p1, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2, p3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-virtual {p0}, LxY3;->a()Landroid/view/Menu;

    move-result-object p2

    const/4 p3, 0x2

    invoke-interface {p2, p3}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object p2

    sget-object p3, Lzendesk/messaging/ui/MessagePopUpHelper$Option;->DELETE:Lzendesk/messaging/ui/MessagePopUpHelper$Option;

    invoke-interface {p1, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    invoke-interface {p2, p1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-virtual {p0}, LxY3;->f()V

    return-void
.end method
