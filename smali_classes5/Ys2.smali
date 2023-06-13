.class public final synthetic LYs2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:LMP2;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;LMP2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYs2;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, LYs2;->c:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, LYs2;->d:Ljava/lang/Object;

    iput-object p4, p0, LYs2;->e:LMP2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LYs2;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, p0, LYs2;->c:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, LYs2;->d:Ljava/lang/Object;

    iget-object v3, p0, LYs2;->e:LMP2;

    invoke-static {v0, v1, v2, v3}, LXs2$e;->a(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;LMP2;)V

    return-void
.end method
