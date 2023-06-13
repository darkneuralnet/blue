.class public final Lun2$c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDO2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lun2$c;->a(LVn2;J)Lxn2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:LVn2;

.field public final synthetic d:I


# direct methods
.method public constructor <init>(ZLjava/util/List;LVn2;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "LVn2;",
            "I)V"
        }
    .end annotation

    iput-boolean p1, p0, Lun2$c$d;->a:Z

    iput-object p2, p0, Lun2$c$d;->b:Ljava/util/List;

    iput-object p3, p0, Lun2$c$d;->c:LVn2;

    iput p4, p0, Lun2$c$d;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I[Lyn2;Ljava/util/List;I)Lzn2;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[",
            "Lyn2;",
            "Ljava/util/List<",
            "LdE1;",
            ">;I)",
            "Lzn2;"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "spans"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzn2;

    iget-boolean v5, p0, Lun2$c$d;->a:Z

    iget-object v1, p0, Lun2$c$d;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    iget-object v1, p0, Lun2$c$d;->c:LVn2;

    invoke-interface {v1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v7

    iget v9, p0, Lun2$c$d;->d:I

    const/4 v10, 0x0

    move-object v1, v0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move v8, p4

    invoke-direct/range {v1 .. v10}, Lzn2;-><init>(I[Lyn2;Ljava/util/List;ZILpm2;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
