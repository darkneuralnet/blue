.class public final synthetic LrI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LOI;

.field public final synthetic c:LXn1$b;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(LOI;LXn1$b;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrI;->b:LOI;

    iput-object p2, p0, LrI;->c:LXn1$b;

    iput-object p3, p0, LrI;->d:Ljava/lang/String;

    iput-object p4, p0, LrI;->e:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LrI;->b:LOI;

    iget-object v1, p0, LrI;->c:LXn1$b;

    iget-object v2, p0, LrI;->d:Ljava/lang/String;

    iget-object v3, p0, LrI;->e:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, v2, v3}, LOI;->y(LOI;LXn1$b;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
