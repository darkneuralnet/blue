.class public final Lso2$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCO2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lso2$c;->a(LVn2;J)Lvo2;
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
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:LVn2;

.field public final synthetic d:Z

.field public final synthetic e:LK9$b;

.field public final synthetic f:LK9$c;

.field public final synthetic g:Z

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Lno2;

.field public final synthetic k:J


# direct methods
.method public constructor <init>(IILVn2;ZLK9$b;LK9$c;ZIILno2;J)V
    .locals 0

    iput p1, p0, Lso2$c$b;->a:I

    iput p2, p0, Lso2$c$b;->b:I

    iput-object p3, p0, Lso2$c$b;->c:LVn2;

    iput-boolean p4, p0, Lso2$c$b;->d:Z

    iput-object p5, p0, Lso2$c$b;->e:LK9$b;

    iput-object p6, p0, Lso2$c$b;->f:LK9$c;

    iput-boolean p7, p0, Lso2$c$b;->g:Z

    iput p8, p0, Lso2$c$b;->h:I

    iput p9, p0, Lso2$c$b;->i:I

    iput-object p10, p0, Lso2$c$b;->j:Lno2;

    iput-wide p11, p0, Lso2$c$b;->k:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;Ljava/util/List;)LEo2;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "+",
            "LOU3;",
            ">;)",
            "LEo2;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "key"

    move-object/from16 v14, p2

    invoke-static {v14, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "placeables"

    move-object/from16 v4, p3

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, v0, Lso2$c$b;->a:I

    add-int/lit8 v1, v1, -0x1

    move/from16 v3, p1

    if-ne v3, v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget v1, v0, Lso2$c$b;->b:I

    :goto_0
    move v13, v1

    iget-object v1, v0, Lso2$c$b;->c:LVn2;

    invoke-interface {v1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v8

    new-instance v1, LEo2;

    iget-boolean v5, v0, Lso2$c$b;->d:Z

    iget-object v6, v0, Lso2$c$b;->e:LK9$b;

    iget-object v7, v0, Lso2$c$b;->f:LK9$c;

    iget-boolean v9, v0, Lso2$c$b;->g:Z

    iget v10, v0, Lso2$c$b;->h:I

    iget v11, v0, Lso2$c$b;->i:I

    iget-object v12, v0, Lso2$c$b;->j:Lno2;

    iget-wide v14, v0, Lso2$c$b;->k:J

    const/16 v17, 0x0

    move-object v2, v1

    move/from16 v3, p1

    move-object/from16 v4, p3

    move-object/from16 v16, p2

    invoke-direct/range {v2 .. v17}, LEo2;-><init>(ILjava/util/List;ZLK9$b;LK9$c;Lpm2;ZIILno2;IJLjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
