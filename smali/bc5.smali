.class public final Lbc5;
.super LKC0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0005\u001a\u00020\u000e\u0012\u0006\u0010\u0006\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\u000e\u0012\u0006\u0010\u0008\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0018\u0010\u0019JE\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ(\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0008\u001a\u00020\u000eH\u0016J\u0008\u0010\u0011\u001a\u00020\u0010H\u0016J\u0013\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\u0008\u0010\u0017\u001a\u00020\u0016H\u0016\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lbc5;",
        "LKC0;",
        "LxB5;",
        "size",
        "",
        "topStart",
        "topEnd",
        "bottomEnd",
        "bottomStart",
        "Lpm2;",
        "layoutDirection",
        "LMz3;",
        "d",
        "(JFFFFLpm2;)LMz3;",
        "LOC0;",
        "i",
        "",
        "toString",
        "",
        "other",
        "",
        "equals",
        "",
        "hashCode",
        "<init>",
        "(LOC0;LOC0;LOC0;LOC0;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LOC0;LOC0;LOC0;LOC0;)V
    .locals 1

    const-string v0, "topStart"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topEnd"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottomEnd"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottomStart"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p4}, LKC0;-><init>(LOC0;LOC0;LOC0;LOC0;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(LOC0;LOC0;LOC0;LOC0;)LKC0;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lbc5;->i(LOC0;LOC0;LOC0;LOC0;)Lbc5;

    move-result-object p1

    return-object p1
.end method

.method public d(JFFFFLpm2;)LMz3;
    .locals 16

    move-object/from16 v0, p7

    const-string v1, "layoutDirection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    add-float v1, p3, p4

    add-float v1, v1, p5

    add-float v1, v1, p6

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    new-instance v0, LMz3$b;

    invoke-static/range {p1 .. p2}, LCB5;->c(J)LOs4;

    move-result-object v1

    invoke-direct {v0, v1}, LMz3$b;-><init>(LOs4;)V

    goto :goto_5

    :cond_1
    new-instance v1, LMz3$c;

    invoke-static/range {p1 .. p2}, LCB5;->c(J)LOs4;

    move-result-object v3

    sget-object v4, Lpm2;->b:Lpm2;

    if-ne v0, v4, :cond_2

    move/from16 v5, p3

    goto :goto_1

    :cond_2
    move/from16 v5, p4

    :goto_1
    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static {v5, v2, v6, v7}, LMC0;->b(FFILjava/lang/Object;)J

    move-result-wide v8

    if-ne v0, v4, :cond_3

    move/from16 v5, p4

    goto :goto_2

    :cond_3
    move/from16 v5, p3

    :goto_2
    invoke-static {v5, v2, v6, v7}, LMC0;->b(FFILjava/lang/Object;)J

    move-result-wide v10

    if-ne v0, v4, :cond_4

    move/from16 v5, p5

    goto :goto_3

    :cond_4
    move/from16 v5, p6

    :goto_3
    invoke-static {v5, v2, v6, v7}, LMC0;->b(FFILjava/lang/Object;)J

    move-result-wide v12

    if-ne v0, v4, :cond_5

    move/from16 v0, p6

    goto :goto_4

    :cond_5
    move/from16 v0, p5

    :goto_4
    invoke-static {v0, v2, v6, v7}, LMC0;->b(FFILjava/lang/Object;)J

    move-result-wide v14

    move-wide v4, v8

    move-wide v6, v10

    move-wide v8, v12

    move-wide v10, v14

    invoke-static/range {v3 .. v11}, LZb5;->b(LOs4;JJJJ)LWb5;

    move-result-object v0

    invoke-direct {v1, v0}, LMz3$c;-><init>(LWb5;)V

    move-object v0, v1

    :goto_5
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lbc5;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, LKC0;->h()LOC0;

    move-result-object v1

    check-cast p1, Lbc5;

    invoke-virtual {p1}, LKC0;->h()LOC0;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, LKC0;->g()LOC0;

    move-result-object v1

    invoke-virtual {p1}, LKC0;->g()LOC0;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, LKC0;->e()LOC0;

    move-result-object v1

    invoke-virtual {p1}, LKC0;->e()LOC0;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    invoke-virtual {p0}, LKC0;->f()LOC0;

    move-result-object v1

    invoke-virtual {p1}, LKC0;->f()LOC0;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, LKC0;->h()LOC0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LKC0;->g()LOC0;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LKC0;->e()LOC0;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LKC0;->f()LOC0;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public i(LOC0;LOC0;LOC0;LOC0;)Lbc5;
    .locals 1

    const-string v0, "topStart"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topEnd"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottomEnd"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottomStart"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbc5;

    invoke-direct {v0, p1, p2, p3, p4}, Lbc5;-><init>(LOC0;LOC0;LOC0;LOC0;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RoundedCornerShape(topStart = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LKC0;->h()LOC0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", topEnd = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LKC0;->g()LOC0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bottomEnd = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LKC0;->e()LOC0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bottomStart = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LKC0;->f()LOC0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
