.class public final synthetic LxO6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appboy/events/IEventSubscriber;


# instance fields
.field public final synthetic a:Lbo/app/m;


# direct methods
.method public synthetic constructor <init>(Lbo/app/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LxO6;->a:Lbo/app/m;

    return-void
.end method


# virtual methods
.method public final trigger(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LxO6;->a:Lbo/app/m;

    check-cast p1, Lbo/app/e5;

    invoke-static {v0, p1}, Lbo/app/m;->b(Lbo/app/m;Lbo/app/e5;)V

    return-void
.end method
