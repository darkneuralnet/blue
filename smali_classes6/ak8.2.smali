.class public final synthetic Lak8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc69;


# instance fields
.field public final synthetic a:Lal8;

.field public final synthetic b:LNp9;

.field public final synthetic c:I

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lal8;LNp9;ILjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak8;->a:Lal8;

    iput-object p2, p0, Lak8;->b:LNp9;

    iput p3, p0, Lak8;->c:I

    iput-object p4, p0, Lak8;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final zza()LMb9;
    .locals 4

    iget-object v0, p0, Lak8;->a:Lal8;

    iget-object v1, p0, Lak8;->b:LNp9;

    iget v2, p0, Lak8;->c:I

    iget-object v3, p0, Lak8;->d:Ljava/util/List;

    invoke-virtual {v0, v1, v2, v3}, Lal8;->b(LNp9;ILjava/util/List;)LMb9;

    move-result-object v0

    return-object v0
.end method
