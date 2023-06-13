.class public final LpV0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\'\u001a\u00020!\u00a2\u0006\u0004\u0008(\u0010)J\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0005\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0016\u0010\u0008\u001a\u00020\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\u0006J\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u000c\u001a\u00020\u000b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0016\u0010\u000f\u001a\u00020\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u0010H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0008\u0010\u0014\u001a\u00020\u0013H\u0002J\u0008\u0010\u0016\u001a\u00020\u0015H\u0002J\u0008\u0010\u0018\u001a\u00020\u0017H\u0002J\u0008\u0010\u001a\u001a\u00020\u0019H\u0002J\u0008\u0010\u001c\u001a\u00020\u001bH\u0002J\u0018\u0010\u001e\u001a\u00020\u001dH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u0006J\u0008\u0010 \u001a\u00020\u001fH\u0002J\n\u0010\"\u001a\u0004\u0018\u00010!H\u0002J\u0008\u0010#\u001a\u00020\u001bH\u0002R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010%\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006*"
    }
    d2 = {
        "LpV0;",
        "",
        "LGN5;",
        "k",
        "Lpm0;",
        "d",
        "()J",
        "LM26;",
        "o",
        "LJw1;",
        "h",
        "LEw1;",
        "f",
        "()I",
        "LFw1;",
        "g",
        "LHE;",
        "b",
        "()F",
        "LL16;",
        "n",
        "LR06;",
        "m",
        "LPx5;",
        "j",
        "",
        "c",
        "",
        "i",
        "Lkotlin/ULong;",
        "p",
        "",
        "e",
        "",
        "l",
        "a",
        "Landroid/os/Parcel;",
        "Landroid/os/Parcel;",
        "parcel",
        "string",
        "<init>",
        "(Ljava/lang/String;)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Landroid/os/Parcel;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    const-string v1, "obtain()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LpV0;->a:Landroid/os/Parcel;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    array-length v2, p1

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Parcel;->unmarshall([BII)V

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, LpV0;->a:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->dataAvail()I

    move-result v0

    return v0
.end method

.method public final b()F
    .locals 1

    invoke-virtual {p0}, LpV0;->e()F

    move-result v0

    invoke-static {v0}, LHE;->c(F)F

    move-result v0

    return v0
.end method

.method public final c()B
    .locals 1

    iget-object v0, p0, LpV0;->a:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readByte()B

    move-result v0

    return v0
.end method

.method public final d()J
    .locals 2

    invoke-virtual {p0}, LpV0;->p()J

    move-result-wide v0

    invoke-static {v0, v1}, Lpm0;->j(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final e()F
    .locals 1

    iget-object v0, p0, LpV0;->a:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    return v0
.end method

.method public final f()I
    .locals 2

    invoke-virtual {p0}, LpV0;->c()B

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, LEw1;->b:LEw1$a;

    invoke-virtual {v0}, LEw1$a;->b()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    sget-object v0, LEw1;->b:LEw1$a;

    invoke-virtual {v0}, LEw1$a;->a()I

    move-result v0

    goto :goto_0

    :cond_1
    sget-object v0, LEw1;->b:LEw1$a;

    invoke-virtual {v0}, LEw1$a;->b()I

    move-result v0

    :goto_0
    return v0
.end method

.method public final g()I
    .locals 2

    invoke-virtual {p0}, LpV0;->c()B

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, LFw1;->b:LFw1$a;

    invoke-virtual {v0}, LFw1$a;->b()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    sget-object v0, LFw1;->b:LFw1$a;

    invoke-virtual {v0}, LFw1$a;->a()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    sget-object v0, LFw1;->b:LFw1$a;

    invoke-virtual {v0}, LFw1$a;->c()I

    move-result v0

    goto :goto_0

    :cond_2
    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    sget-object v0, LFw1;->b:LFw1$a;

    invoke-virtual {v0}, LFw1$a;->d()I

    move-result v0

    goto :goto_0

    :cond_3
    sget-object v0, LFw1;->b:LFw1$a;

    invoke-virtual {v0}, LFw1$a;->b()I

    move-result v0

    :goto_0
    return v0
.end method

.method public final h()LJw1;
    .locals 2

    new-instance v0, LJw1;

    invoke-virtual {p0}, LpV0;->i()I

    move-result v1

    invoke-direct {v0, v1}, LJw1;-><init>(I)V

    return-object v0
.end method

.method public final i()I
    .locals 1

    iget-object v0, p0, LpV0;->a:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    return v0
.end method

.method public final j()LPx5;
    .locals 8

    new-instance v7, LPx5;

    invoke-virtual {p0}, LpV0;->d()J

    move-result-wide v1

    invoke-virtual {p0}, LpV0;->e()F

    move-result v0

    invoke-virtual {p0}, LpV0;->e()F

    move-result v3

    invoke-static {v0, v3}, LGe3;->a(FF)J

    move-result-wide v3

    invoke-virtual {p0}, LpV0;->e()F

    move-result v5

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LPx5;-><init>(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public final k()LGN5;
    .locals 22

    new-instance v15, LDX2;

    move-object v0, v15

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v21, v15

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x3fff

    const/16 v20, 0x0

    invoke-direct/range {v0 .. v20}, LDX2;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, p0

    :goto_0
    iget-object v1, v0, LpV0;->a:Landroid/os/Parcel;

    invoke-virtual {v1}, Landroid/os/Parcel;->dataAvail()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_c

    invoke-virtual/range {p0 .. p0}, LpV0;->c()B

    move-result v1

    const/16 v3, 0x8

    if-ne v1, v2, :cond_0

    invoke-virtual/range {p0 .. p0}, LpV0;->a()I

    move-result v1

    if-lt v1, v3, :cond_c

    invoke-virtual/range {p0 .. p0}, LpV0;->d()J

    move-result-wide v1

    move-object/from16 v4, v21

    invoke-virtual {v4, v1, v2}, LDX2;->c(J)V

    goto :goto_0

    :cond_0
    move-object/from16 v4, v21

    const/4 v5, 0x2

    const/4 v6, 0x5

    if-ne v1, v5, :cond_2

    invoke-virtual/range {p0 .. p0}, LpV0;->a()I

    move-result v1

    if-lt v1, v6, :cond_d

    invoke-virtual/range {p0 .. p0}, LpV0;->o()J

    move-result-wide v1

    invoke-virtual {v4, v1, v2}, LDX2;->e(J)V

    :cond_1
    :goto_1
    move-object/from16 v21, v4

    goto :goto_0

    :cond_2
    const/4 v5, 0x3

    const/4 v7, 0x4

    if-ne v1, v5, :cond_3

    invoke-virtual/range {p0 .. p0}, LpV0;->a()I

    move-result v1

    if-lt v1, v7, :cond_d

    invoke-virtual/range {p0 .. p0}, LpV0;->h()LJw1;

    move-result-object v1

    invoke-virtual {v4, v1}, LDX2;->h(LJw1;)V

    goto :goto_1

    :cond_3
    if-ne v1, v7, :cond_4

    invoke-virtual/range {p0 .. p0}, LpV0;->a()I

    move-result v1

    if-lt v1, v2, :cond_d

    invoke-virtual/range {p0 .. p0}, LpV0;->f()I

    move-result v1

    invoke-static {v1}, LEw1;->c(I)LEw1;

    move-result-object v1

    invoke-virtual {v4, v1}, LDX2;->f(LEw1;)V

    goto :goto_1

    :cond_4
    if-ne v1, v6, :cond_5

    invoke-virtual/range {p0 .. p0}, LpV0;->a()I

    move-result v1

    if-lt v1, v2, :cond_d

    invoke-virtual/range {p0 .. p0}, LpV0;->g()I

    move-result v1

    invoke-static {v1}, LFw1;->e(I)LFw1;

    move-result-object v1

    invoke-virtual {v4, v1}, LDX2;->g(LFw1;)V

    goto :goto_1

    :cond_5
    const/4 v2, 0x6

    if-ne v1, v2, :cond_6

    invoke-virtual/range {p0 .. p0}, LpV0;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, LDX2;->d(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    const/4 v2, 0x7

    if-ne v1, v2, :cond_7

    invoke-virtual/range {p0 .. p0}, LpV0;->a()I

    move-result v1

    if-lt v1, v6, :cond_d

    invoke-virtual/range {p0 .. p0}, LpV0;->o()J

    move-result-wide v1

    invoke-virtual {v4, v1, v2}, LDX2;->i(J)V

    goto :goto_1

    :cond_7
    if-ne v1, v3, :cond_8

    invoke-virtual/range {p0 .. p0}, LpV0;->a()I

    move-result v1

    if-lt v1, v7, :cond_d

    invoke-virtual/range {p0 .. p0}, LpV0;->b()F

    move-result v1

    invoke-static {v1}, LHE;->b(F)LHE;

    move-result-object v1

    invoke-virtual {v4, v1}, LDX2;->b(LHE;)V

    goto :goto_1

    :cond_8
    const/16 v2, 0x9

    if-ne v1, v2, :cond_9

    invoke-virtual/range {p0 .. p0}, LpV0;->a()I

    move-result v1

    if-lt v1, v3, :cond_d

    invoke-virtual/range {p0 .. p0}, LpV0;->n()LL16;

    move-result-object v1

    invoke-virtual {v4, v1}, LDX2;->l(LL16;)V

    goto :goto_1

    :cond_9
    const/16 v2, 0xa

    if-ne v1, v2, :cond_a

    invoke-virtual/range {p0 .. p0}, LpV0;->a()I

    move-result v1

    if-lt v1, v3, :cond_d

    invoke-virtual/range {p0 .. p0}, LpV0;->d()J

    move-result-wide v1

    invoke-virtual {v4, v1, v2}, LDX2;->a(J)V

    goto/16 :goto_1

    :cond_a
    const/16 v2, 0xb

    if-ne v1, v2, :cond_b

    invoke-virtual/range {p0 .. p0}, LpV0;->a()I

    move-result v1

    if-lt v1, v7, :cond_d

    invoke-virtual/range {p0 .. p0}, LpV0;->m()LR06;

    move-result-object v1

    invoke-virtual {v4, v1}, LDX2;->k(LR06;)V

    goto/16 :goto_1

    :cond_b
    const/16 v2, 0xc

    if-ne v1, v2, :cond_1

    invoke-virtual/range {p0 .. p0}, LpV0;->a()I

    move-result v1

    const/16 v2, 0x14

    if-lt v1, v2, :cond_d

    invoke-virtual/range {p0 .. p0}, LpV0;->j()LPx5;

    move-result-object v1

    invoke-virtual {v4, v1}, LDX2;->j(LPx5;)V

    goto/16 :goto_1

    :cond_c
    move-object/from16 v4, v21

    :cond_d
    invoke-virtual {v4}, LDX2;->m()LGN5;

    move-result-object v1

    return-object v1
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LpV0;->a:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final m()LR06;
    .locals 6

    invoke-virtual {p0}, LpV0;->i()I

    move-result v0

    sget-object v1, LR06;->b:LR06$a;

    invoke-virtual {v1}, LR06$a;->b()LR06;

    move-result-object v2

    invoke-virtual {v2}, LR06;->e()I

    move-result v2

    and-int/2addr v2, v0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    invoke-virtual {v1}, LR06$a;->d()LR06;

    move-result-object v5

    invoke-virtual {v5}, LR06;->e()I

    move-result v5

    and-int/2addr v0, v5

    if-eqz v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    if-eqz v2, :cond_2

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    new-array v0, v0, [LR06;

    invoke-virtual {v1}, LR06$a;->b()LR06;

    move-result-object v2

    aput-object v2, v0, v4

    invoke-virtual {v1}, LR06$a;->d()LR06;

    move-result-object v2

    aput-object v2, v0, v3

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, LR06$a;->a(Ljava/util/List;)LR06;

    move-result-object v0

    goto :goto_2

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v1}, LR06$a;->b()LR06;

    move-result-object v0

    goto :goto_2

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {v1}, LR06$a;->d()LR06;

    move-result-object v0

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, LR06$a;->c()LR06;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method public final n()LL16;
    .locals 3

    new-instance v0, LL16;

    invoke-virtual {p0}, LpV0;->e()F

    move-result v1

    invoke-virtual {p0}, LpV0;->e()F

    move-result v2

    invoke-direct {v0, v1, v2}, LL16;-><init>(FF)V

    return-object v0
.end method

.method public final o()J
    .locals 4

    invoke-virtual {p0}, LpV0;->c()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, LO26;->b:LO26$a;

    invoke-virtual {v0}, LO26$a;->b()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    sget-object v0, LO26;->b:LO26$a;

    invoke-virtual {v0}, LO26$a;->a()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    sget-object v0, LO26;->b:LO26$a;

    invoke-virtual {v0}, LO26$a;->c()J

    move-result-wide v0

    :goto_0
    sget-object v2, LO26;->b:LO26$a;

    invoke-virtual {v2}, LO26$a;->c()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LO26;->g(JJ)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v0, LM26;->b:LM26$a;

    invoke-virtual {v0}, LM26$a;->a()J

    move-result-wide v0

    return-wide v0

    :cond_2
    invoke-virtual {p0}, LpV0;->e()F

    move-result v2

    invoke-static {v2, v0, v1}, LN26;->a(FJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final p()J
    .locals 2

    iget-object v0, p0, LpV0;->a:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    return-wide v0
.end method
