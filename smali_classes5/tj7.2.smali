.class public final Ltj7;
.super LGy9;
.source "SourceFile"


# instance fields
.field public final d:Lll7;


# direct methods
.method public constructor <init>(Lll7;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, LGy9;-><init>(II)V

    iput-object p1, p0, Ltj7;->d:Lll7;

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltj7;->d:Lll7;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
