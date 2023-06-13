.class public final synthetic LoN6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appboy/events/IEventSubscriber;


# instance fields
.field public final synthetic a:Lbo/app/f;

.field public final synthetic b:Lbo/app/g2;


# direct methods
.method public synthetic constructor <init>(Lbo/app/f;Lbo/app/g2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LoN6;->a:Lbo/app/f;

    iput-object p2, p0, LoN6;->b:Lbo/app/g2;

    return-void
.end method


# virtual methods
.method public final trigger(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, LoN6;->a:Lbo/app/f;

    iget-object v1, p0, LoN6;->b:Lbo/app/g2;

    check-cast p1, Lbo/app/m0;

    invoke-static {v0, v1, p1}, Lbo/app/f;->b(Lbo/app/f;Lbo/app/g2;Lbo/app/m0;)V

    return-void
.end method
