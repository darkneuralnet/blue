.class public final synthetic Lv33;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/j;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function5;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv33;->a:Lkotlin/jvm/functions/Function5;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lv33;->a:Lkotlin/jvm/functions/Function5;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lz33;->t(Lkotlin/jvm/functions/Function5;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;

    move-result-object p1

    return-object p1
.end method
