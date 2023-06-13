.class public final Lun2$c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBO2;


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
.field public final synthetic a:LVn2;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:Lmn2;

.field public final synthetic g:J


# direct methods
.method public constructor <init>(LVn2;ZZIILmn2;J)V
    .locals 0

    iput-object p1, p0, Lun2$c$c;->a:LVn2;

    iput-boolean p2, p0, Lun2$c$c;->b:Z

    iput-boolean p3, p0, Lun2$c$c;->c:Z

    iput p4, p0, Lun2$c$c;->d:I

    iput p5, p0, Lun2$c$c;->e:I

    iput-object p6, p0, Lun2$c$c;->f:Lmn2;

    iput-wide p7, p0, Lun2$c$c;->g:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;IILjava/util/List;)Lyn2;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Object;",
            "II",
            "Ljava/util/List<",
            "+",
            "LOU3;",
            ">;)",
            "Lyn2;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "key"

    move-object/from16 v4, p2

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "placeables"

    move-object/from16 v12, p5

    invoke-static {v12, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lun2$c$c;->a:LVn2;

    invoke-interface {v1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v9

    new-instance v1, Lyn2;

    iget-boolean v5, v0, Lun2$c$c;->b:Z

    iget-boolean v8, v0, Lun2$c$c;->c:Z

    iget v10, v0, Lun2$c$c;->d:I

    iget v11, v0, Lun2$c$c;->e:I

    iget-object v13, v0, Lun2$c$c;->f:Lmn2;

    iget-wide v14, v0, Lun2$c$c;->g:J

    const/16 v16, 0x0

    move-object v2, v1

    move/from16 v3, p1

    move/from16 v6, p3

    move/from16 v7, p4

    invoke-direct/range {v2 .. v16}, Lyn2;-><init>(ILjava/lang/Object;ZIIZLpm2;IILjava/util/List;Lmn2;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
