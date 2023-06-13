.class public final LfL6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPK6;


# instance fields
.field public final synthetic a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LfL6;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, LfL6;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/io/File;Ljava/util/ArrayList;)[Ljava/lang/Object;
    .locals 10

    iget v0, p0, LfL6;->a:I

    if-eqz v0, :cond_0

    const-string v2, "makeDexElements"

    const-class v3, [Ljava/lang/Object;

    const-class v4, Ljava/util/ArrayList;

    const-class v6, Ljava/io/File;

    const-class v8, Ljava/util/ArrayList;

    move-object v1, p1

    move-object v5, p2

    move-object v7, p3

    move-object v9, p4

    invoke-static/range {v1 .. v9}, LpL6;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    check-cast p1, [Ljava/lang/Object;

    return-object p1

    :cond_0
    const-string v1, "makePathElements"

    const-class v2, [Ljava/lang/Object;

    const-class v3, Ljava/util/List;

    const-class v5, Ljava/io/File;

    const-class v7, Ljava/util/List;

    move-object v0, p1

    move-object v4, p2

    move-object v6, p3

    move-object v8, p4

    invoke-static/range {v0 .. v8}, LpL6;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0
.end method
