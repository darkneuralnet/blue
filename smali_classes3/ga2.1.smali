.class public final enum Lga2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lga2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0006j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lga2;",
        "",
        "",
        "b",
        "I",
        "c",
        "()I",
        "title",
        "icon",
        "<init>",
        "(Ljava/lang/String;III)V",
        "d",
        "e",
        "f",
        "g",
        "co.bird.android.feature.complaintresolution"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum d:Lga2;

.field public static final enum e:Lga2;

.field public static final enum f:Lga2;

.field public static final enum g:Lga2;

.field public static final synthetic h:[Lga2;


# instance fields
.field public final b:I

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lga2;

    sget v1, Lnl4;->birds_involved:I

    sget v2, Lrg4;->ic_bird_logo:I

    const-string v3, "BIRDS_INVOLVED"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lga2;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lga2;->d:Lga2;

    new-instance v0, Lga2;

    sget v1, Lnl4;->non_bird_vehicles:I

    sget v2, Lrg4;->ic_scooter:I

    const-string v3, "NON_BIRD_VEHICLES"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lga2;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lga2;->e:Lga2;

    new-instance v0, Lga2;

    sget v1, Lnl4;->vehicles_compliant:I

    sget v2, Lrg4;->ic_check:I

    const-string v3, "COMPLIANT_VEHICLES"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lga2;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lga2;->f:Lga2;

    new-instance v0, Lga2;

    sget v1, Lnl4;->no_vehicles:I

    sget v2, Lrg4;->ic_visibility_off:I

    const-string v3, "NO_VEHICLES"

    const/4 v4, 0x3

    invoke-direct {v0, v3, v4, v1, v2}, Lga2;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lga2;->g:Lga2;

    invoke-static {}, Lga2;->a()[Lga2;

    move-result-object v0

    sput-object v0, Lga2;->h:[Lga2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lga2;->b:I

    iput p4, p0, Lga2;->c:I

    return-void
.end method

.method public static final synthetic a()[Lga2;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lga2;

    const/4 v1, 0x0

    sget-object v2, Lga2;->d:Lga2;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lga2;->e:Lga2;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lga2;->f:Lga2;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lga2;->g:Lga2;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lga2;
    .locals 1

    const-class v0, Lga2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lga2;

    return-object p0
.end method

.method public static values()[Lga2;
    .locals 1

    sget-object v0, Lga2;->h:[Lga2;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lga2;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, Lga2;->c:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lga2;->b:I

    return v0
.end method
