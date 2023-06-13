.class public final enum Lzg2$g;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzg2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lzg2$g;",
        ">;",
        "Ljava/util/Iterator<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lzg2$g;

.field public static final synthetic c:[Lzg2$g;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lzg2$g;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lzg2$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lzg2$g;->b:Lzg2$g;

    invoke-static {}, Lzg2$g;->a()[Lzg2$g;

    move-result-object v0

    sput-object v0, Lzg2$g;->c:[Lzg2$g;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a()[Lzg2$g;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lzg2$g;

    const/4 v1, 0x0

    sget-object v2, Lzg2$g;->b:Lzg2$g;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lzg2$g;
    .locals 1

    const-class v0, Lzg2$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lzg2$g;

    return-object p0
.end method

.method public static values()[Lzg2$g;
    .locals 1

    sget-object v0, Lzg2$g;->c:[Lzg2$g;

    invoke-virtual {v0}, [Lzg2$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzg2$g;

    return-object v0
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Ldm0;->d(Z)V

    return-void
.end method
