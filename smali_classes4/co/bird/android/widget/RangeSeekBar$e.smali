.class public final enum Lco/bird/android/widget/RangeSeekBar$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/widget/RangeSeekBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/widget/RangeSeekBar$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lco/bird/android/widget/RangeSeekBar$e;

.field public static final enum c:Lco/bird/android/widget/RangeSeekBar$e;

.field public static final synthetic d:[Lco/bird/android/widget/RangeSeekBar$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/widget/RangeSeekBar$e;

    const-string v1, "LEFT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/widget/RangeSeekBar$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/widget/RangeSeekBar$e;->b:Lco/bird/android/widget/RangeSeekBar$e;

    new-instance v0, Lco/bird/android/widget/RangeSeekBar$e;

    const-string v1, "RIGHT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/widget/RangeSeekBar$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/widget/RangeSeekBar$e;->c:Lco/bird/android/widget/RangeSeekBar$e;

    invoke-static {}, Lco/bird/android/widget/RangeSeekBar$e;->a()[Lco/bird/android/widget/RangeSeekBar$e;

    move-result-object v0

    sput-object v0, Lco/bird/android/widget/RangeSeekBar$e;->d:[Lco/bird/android/widget/RangeSeekBar$e;

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

.method public static synthetic a()[Lco/bird/android/widget/RangeSeekBar$e;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/widget/RangeSeekBar$e;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/widget/RangeSeekBar$e;->b:Lco/bird/android/widget/RangeSeekBar$e;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/widget/RangeSeekBar$e;->c:Lco/bird/android/widget/RangeSeekBar$e;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/widget/RangeSeekBar$e;
    .locals 1

    const-class v0, Lco/bird/android/widget/RangeSeekBar$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/widget/RangeSeekBar$e;

    return-object p0
.end method

.method public static values()[Lco/bird/android/widget/RangeSeekBar$e;
    .locals 1

    sget-object v0, Lco/bird/android/widget/RangeSeekBar$e;->d:[Lco/bird/android/widget/RangeSeekBar$e;

    invoke-virtual {v0}, [Lco/bird/android/widget/RangeSeekBar$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/widget/RangeSeekBar$e;

    return-object v0
.end method
