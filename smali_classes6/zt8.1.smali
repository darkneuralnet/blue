.class public final synthetic Lzt8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:LBA8;


# direct methods
.method public synthetic constructor <init>(LBA8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzt8;->a:LBA8;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;ILs19;)LRl9;
    .locals 1

    iget-object v0, p0, Lzt8;->a:LBA8;

    check-cast p1, LP58;

    invoke-virtual {v0, p1, p2, p3}, LBA8;->k(LP58;ILs19;)LRl9;

    move-result-object p1

    return-object p1
.end method
