.class public final synthetic LpN6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appboy/events/IEventSubscriber;


# instance fields
.field public final synthetic a:Lbo/app/f0;


# direct methods
.method public synthetic constructor <init>(Lbo/app/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpN6;->a:Lbo/app/f0;

    return-void
.end method


# virtual methods
.method public final trigger(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LpN6;->a:Lbo/app/f0;

    check-cast p1, Lbo/app/h5;

    invoke-static {v0, p1}, Lbo/app/f0;->e(Lbo/app/f0;Lbo/app/h5;)V

    return-void
.end method
