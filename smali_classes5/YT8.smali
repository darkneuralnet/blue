.class public final LYT8;
.super LYR8;
.source "SourceFile"


# instance fields
.field public final d:LvU8;


# direct methods
.method public constructor <init>(LvU8;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, LYR8;-><init>(II)V

    iput-object p1, p0, LYT8;->d:LvU8;

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LYT8;->d:LvU8;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
