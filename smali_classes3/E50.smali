.class public final synthetic LE50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# instance fields
.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE50;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LE50;->b:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, LD50$f;->a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lwb4;

    move-result-object p1

    return-object p1
.end method