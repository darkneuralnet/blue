.class abstract Lzendesk/messaging/MessagingModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static belvedere(Landroid/content/Context;)Lzendesk/belvedere/a;
    .locals 0
    .annotation runtime Ldagger/Provides;
    .end annotation

    invoke-static {p0}, Lzendesk/belvedere/a;->c(Landroid/content/Context;)Lzendesk/belvedere/a;

    move-result-object p0

    return-object p0
.end method

.method public static picasso(Landroid/content/Context;)LiT3;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    new-instance v0, LiT3$b;

    invoke-direct {v0, p0}, LiT3$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, LiT3$b;->a()LiT3;

    move-result-object p0

    return-object p0
.end method

.method public static resources(Landroid/content/Context;)Landroid/content/res/Resources;
    .locals 0
    .annotation runtime Ldagger/Provides;
    .end annotation

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    return-object p0
.end method
