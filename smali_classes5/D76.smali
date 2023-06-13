.class public final synthetic LD76;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfe3;


# instance fields
.field public final synthetic b:LF76;


# direct methods
.method public synthetic constructor <init>(LF76;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD76;->b:LF76;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LD76;->b:LF76;

    check-cast p1, Lkotlin/Pair;

    invoke-static {v0, p1}, LF76;->t8(LF76;Lkotlin/Pair;)V

    return-void
.end method
