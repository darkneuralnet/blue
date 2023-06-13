.class final Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/map/renderer/IconLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MarkerPinWrapper"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0002\u0018\u0000 F2\u00020\u0001:\u0001FB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010B\u001a\u00020C*\u00020\u00082\u0006\u0010D\u001a\u00020EH\u0002R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\nR\u001d\u0010\r\u001a\u0004\u0018\u00010\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u000c\u001a\u0004\u0008\u000e\u0010\nR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u000c\u001a\u0004\u0008\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u000c\u001a\u0004\u0008\u0016\u0010\nR\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u000c\u001a\u0004\u0008\u0019\u0010\nR\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u000c\u001a\u0004\u0008\u001c\u0010\nR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u000c\u001a\u0004\u0008\u001f\u0010\nR\u001d\u0010!\u001a\u0004\u0018\u00010\"8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u000c\u001a\u0004\u0008#\u0010$R\u001d\u0010&\u001a\u0004\u0018\u00010\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008(\u0010\u000c\u001a\u0004\u0008\'\u0010\nR\u001d\u0010)\u001a\u0004\u0018\u00010\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008+\u0010\u000c\u001a\u0004\u0008*\u0010\nR\u001d\u0010,\u001a\u0004\u0018\u00010\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008.\u0010\u000c\u001a\u0004\u0008-\u0010\nR\u001d\u0010/\u001a\u0004\u0018\u00010\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00081\u0010\u000c\u001a\u0004\u00080\u0010\nR\u001d\u00102\u001a\u0004\u0018\u00010\u00118FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00084\u0010\u000c\u001a\u0004\u00083\u0010\u0013R\u001d\u00105\u001a\u0004\u0018\u00010\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00087\u0010\u000c\u001a\u0004\u00086\u0010\nR\u001d\u00108\u001a\u0004\u0018\u00010\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008:\u0010\u000c\u001a\u0004\u00089\u0010\nR\u001d\u0010;\u001a\u0004\u0018\u00010\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008=\u0010\u000c\u001a\u0004\u0008<\u0010\nR\u0011\u0010>\u001a\u00020?\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010A\u00a8\u0006G"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;",
        "",
        "context",
        "Landroid/content/Context;",
        "viewRes",
        "",
        "(Landroid/content/Context;I)V",
        "badgeBg",
        "Landroid/widget/ImageView;",
        "getBadgeBg",
        "()Landroid/widget/ImageView;",
        "badgeBg$delegate",
        "Lkotlin/Lazy;",
        "badgeContent",
        "getBadgeContent",
        "badgeContent$delegate",
        "badgeFrame",
        "Landroid/widget/FrameLayout;",
        "getBadgeFrame",
        "()Landroid/widget/FrameLayout;",
        "badgeFrame$delegate",
        "badgeInnerBg",
        "getBadgeInnerBg",
        "badgeInnerBg$delegate",
        "badgeOuter",
        "getBadgeOuter",
        "badgeOuter$delegate",
        "badgeShadow",
        "getBadgeShadow",
        "badgeShadow$delegate",
        "overrideImage",
        "getOverrideImage",
        "overrideImage$delegate",
        "pillText",
        "Landroid/widget/TextView;",
        "getPillText",
        "()Landroid/widget/TextView;",
        "pillText$delegate",
        "pinBatteryBg",
        "getPinBatteryBg",
        "pinBatteryBg$delegate",
        "pinBatteryLevel",
        "getPinBatteryLevel",
        "pinBatteryLevel$delegate",
        "pinBg",
        "getPinBg",
        "pinBg$delegate",
        "pinContent",
        "getPinContent",
        "pinContent$delegate",
        "pinFrame",
        "getPinFrame",
        "pinFrame$delegate",
        "pinGround",
        "getPinGround",
        "pinGround$delegate",
        "pinRing",
        "getPinRing",
        "pinRing$delegate",
        "pinShadow",
        "getPinShadow",
        "pinShadow$delegate",
        "view",
        "Landroid/view/View;",
        "getView",
        "()Landroid/view/View;",
        "applyShadow",
        "",
        "shadowParams",
        "Lco/bird/android/app/feature/map/renderer/ShadowInitParams;",
        "Companion",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$Companion;

.field private static final SHADOW_COLOR:I = 0x48000000

.field private static final SHADOW_PAINT_COLOR:I = 0x48000000


# instance fields
.field private final badgeBg$delegate:Lkotlin/Lazy;

.field private final badgeContent$delegate:Lkotlin/Lazy;

.field private final badgeFrame$delegate:Lkotlin/Lazy;

.field private final badgeInnerBg$delegate:Lkotlin/Lazy;

.field private final badgeOuter$delegate:Lkotlin/Lazy;

.field private final badgeShadow$delegate:Lkotlin/Lazy;

.field private final overrideImage$delegate:Lkotlin/Lazy;

.field private final pillText$delegate:Lkotlin/Lazy;

.field private final pinBatteryBg$delegate:Lkotlin/Lazy;

.field private final pinBatteryLevel$delegate:Lkotlin/Lazy;

.field private final pinBg$delegate:Lkotlin/Lazy;

.field private final pinContent$delegate:Lkotlin/Lazy;

.field private final pinFrame$delegate:Lkotlin/Lazy;

.field private final pinGround$delegate:Lkotlin/Lazy;

.field private final pinRing$delegate:Lkotlin/Lazy;

.field private final pinShadow$delegate:Lkotlin/Lazy;

.field private final view:Landroid/view/View;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->Companion:Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const-string v3, "context"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, LfB0;->t(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->view:Landroid/view/View;

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$pillText$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$pillText$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->pillText$delegate:Lkotlin/Lazy;

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$pinFrame$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$pinFrame$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->pinFrame$delegate:Lkotlin/Lazy;

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$pinShadow$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$pinShadow$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->pinShadow$delegate:Lkotlin/Lazy;

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$pinBg$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$pinBg$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->pinBg$delegate:Lkotlin/Lazy;

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$pinRing$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$pinRing$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->pinRing$delegate:Lkotlin/Lazy;

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$pinGround$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$pinGround$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->pinGround$delegate:Lkotlin/Lazy;

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$pinBatteryBg$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$pinBatteryBg$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->pinBatteryBg$delegate:Lkotlin/Lazy;

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$pinBatteryLevel$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$pinBatteryLevel$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->pinBatteryLevel$delegate:Lkotlin/Lazy;

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$pinContent$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$pinContent$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->pinContent$delegate:Lkotlin/Lazy;

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$overrideImage$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$overrideImage$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->overrideImage$delegate:Lkotlin/Lazy;

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$badgeFrame$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$badgeFrame$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->badgeFrame$delegate:Lkotlin/Lazy;

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$badgeShadow$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$badgeShadow$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->badgeShadow$delegate:Lkotlin/Lazy;

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$badgeBg$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$badgeBg$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->badgeBg$delegate:Lkotlin/Lazy;

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$badgeOuter$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$badgeOuter$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->badgeOuter$delegate:Lkotlin/Lazy;

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$badgeInnerBg$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$badgeInnerBg$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->badgeInnerBg$delegate:Lkotlin/Lazy;

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$badgeContent$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$badgeContent$2;-><init>(Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->badgeContent$delegate:Lkotlin/Lazy;

    sget v1, Lmj4;->marker_bird_unselected:I

    if-ne v2, v1, :cond_0

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconInitParams;

    new-instance v10, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;

    const/high16 v3, 0x42480000    # 50.0f

    const/high16 v4, 0x42480000    # 50.0f

    const/high16 v5, 0x40a00000    # 5.0f

    const/4 v6, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    const/high16 v8, 0x40e00000    # 7.0f

    const/high16 v9, 0x41200000    # 10.0f

    move-object v2, v10

    invoke-direct/range {v2 .. v9}, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;-><init>(FFFFFFF)V

    new-instance v2, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;

    const/high16 v12, 0x41b00000    # 22.0f

    const/high16 v13, 0x41b00000    # 22.0f

    const/high16 v14, 0x3f800000    # 1.0f

    const/4 v15, 0x0

    const/high16 v16, 0x3f800000    # 1.0f

    const/high16 v17, 0x41000000    # 8.0f

    const/high16 v18, 0x41000000    # 8.0f

    move-object v11, v2

    invoke-direct/range {v11 .. v18}, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;-><init>(FFFFFFF)V

    invoke-direct {v1, v10, v2}, Lco/bird/android/app/feature/map/renderer/IconInitParams;-><init>(Lco/bird/android/app/feature/map/renderer/ShadowInitParams;Lco/bird/android/app/feature/map/renderer/ShadowInitParams;)V

    goto :goto_0

    :cond_0
    sget v1, Lmj4;->marker_bird_selected:I

    if-ne v2, v1, :cond_1

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconInitParams;

    new-instance v10, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;

    const/high16 v3, 0x42500000    # 52.0f

    const/high16 v4, 0x42500000    # 52.0f

    const/high16 v5, 0x40a00000    # 5.0f

    const/4 v6, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    const/high16 v8, 0x40c00000    # 6.0f

    const/high16 v9, 0x40c00000    # 6.0f

    move-object v2, v10

    invoke-direct/range {v2 .. v9}, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;-><init>(FFFFFFF)V

    new-instance v2, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;

    const/high16 v12, 0x41b00000    # 22.0f

    const/high16 v13, 0x41b00000    # 22.0f

    const/high16 v14, 0x3f800000    # 1.0f

    const/4 v15, 0x0

    const/high16 v16, 0x3f800000    # 1.0f

    const/high16 v17, 0x41000000    # 8.0f

    const/high16 v18, 0x41000000    # 8.0f

    move-object v11, v2

    invoke-direct/range {v11 .. v18}, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;-><init>(FFFFFFF)V

    invoke-direct {v1, v10, v2}, Lco/bird/android/app/feature/map/renderer/IconInitParams;-><init>(Lco/bird/android/app/feature/map/renderer/ShadowInitParams;Lco/bird/android/app/feature/map/renderer/ShadowInitParams;)V

    goto :goto_0

    :cond_1
    sget v1, Lmj4;->marker_bird_riding:I

    if-ne v2, v1, :cond_2

    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconInitParams;

    new-instance v10, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;

    const/high16 v3, 0x429c0000    # 78.0f

    const/high16 v4, 0x428c0000    # 70.0f

    const/high16 v5, 0x41000000    # 8.0f

    const/4 v6, 0x0

    const/high16 v7, 0x40400000    # 3.0f

    const/high16 v8, 0x41500000    # 13.0f

    const/high16 v9, 0x41900000    # 18.0f

    move-object v2, v10

    invoke-direct/range {v2 .. v9}, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;-><init>(FFFFFFF)V

    new-instance v2, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;

    const/high16 v12, 0x41e00000    # 28.0f

    const/high16 v13, 0x41e00000    # 28.0f

    const/high16 v14, 0x3f800000    # 1.0f

    const/4 v15, 0x0

    const/high16 v16, 0x3f800000    # 1.0f

    const/high16 v17, 0x40e00000    # 7.0f

    const/high16 v18, 0x41000000    # 8.0f

    move-object v11, v2

    invoke-direct/range {v11 .. v18}, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;-><init>(FFFFFFF)V

    invoke-direct {v1, v10, v2}, Lco/bird/android/app/feature/map/renderer/IconInitParams;-><init>(Lco/bird/android/app/feature/map/renderer/ShadowInitParams;Lco/bird/android/app/feature/map/renderer/ShadowInitParams;)V

    goto :goto_0

    :cond_2
    new-instance v1, Lco/bird/android/app/feature/map/renderer/IconInitParams;

    const/4 v2, 0x3

    invoke-direct {v1, v3, v3, v2, v3}, Lco/bird/android/app/feature/map/renderer/IconInitParams;-><init>(Lco/bird/android/app/feature/map/renderer/ShadowInitParams;Lco/bird/android/app/feature/map/renderer/ShadowInitParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->getPinShadow()Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Lco/bird/android/app/feature/map/renderer/IconInitParams;->getPinShadow()Lco/bird/android/app/feature/map/renderer/ShadowInitParams;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    invoke-direct {v0, v2, v3}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->applyShadow(Landroid/widget/ImageView;Lco/bird/android/app/feature/map/renderer/ShadowInitParams;)V

    :cond_4
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->getBadgeShadow()Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v1}, Lco/bird/android/app/feature/map/renderer/IconInitParams;->getBadgeShadow()Lco/bird/android/app/feature/map/renderer/ShadowInitParams;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-direct {v0, v2, v1}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->applyShadow(Landroid/widget/ImageView;Lco/bird/android/app/feature/map/renderer/ShadowInitParams;)V

    :cond_6
    :goto_2
    return-void
.end method

.method private final applyShadow(Landroid/widget/ImageView;Lco/bird/android/app/feature/map/renderer/ShadowInitParams;)V
    .locals 10

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;->getWidthDp()F

    move-result v0

    invoke-static {p1, v0}, Ltu6;->c(Landroid/view/View;F)I

    move-result v2

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;->getHeightDp()F

    move-result v0

    invoke-static {p1, v0}, Ltu6;->c(Landroid/view/View;F)I

    move-result v3

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;->getRadiusDp()F

    move-result v0

    invoke-static {p1, v0}, Ltu6;->c(Landroid/view/View;F)I

    move-result v0

    int-to-float v0, v0

    new-instance v9, Lco/bird/android/app/feature/map/renderer/OvalShadow;

    const/high16 v5, 0x48000000    # 131072.0f

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v1, v9

    move v4, v0

    invoke-direct/range {v1 .. v8}, Lco/bird/android/app/feature/map/renderer/OvalShadow;-><init>(IIFILandroid/graphics/Paint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {v1, v9}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    const/4 v2, 0x1

    invoke-virtual {v1}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    invoke-virtual {v1}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v2

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;->getOffsetXDp()F

    move-result v3

    invoke-static {p1, v3}, Ltu6;->c(Landroid/view/View;F)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;->getOffsetYDp()F

    move-result v4

    invoke-static {p1, v4}, Ltu6;->c(Landroid/view/View;F)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v2, v0, v3, v4, v5}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    invoke-virtual {v1}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;->getTranslationXDp()F

    move-result v0

    invoke-static {p1, v0}, Ltu6;->c(Landroid/view/View;F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/renderer/ShadowInitParams;->getTranslationYDp()F

    move-result p2

    invoke-static {p1, p2}, Ltu6;->c(Landroid/view/View;F)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public final getBadgeBg()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->badgeBg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getBadgeContent()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->badgeContent$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getBadgeFrame()Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->badgeFrame$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public final getBadgeInnerBg()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->badgeInnerBg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getBadgeOuter()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->badgeOuter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getBadgeShadow()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->badgeShadow$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getOverrideImage()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->overrideImage$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getPillText()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->pillText$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getPinBatteryBg()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->pinBatteryBg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getPinBatteryLevel()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->pinBatteryLevel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getPinBg()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->pinBg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getPinContent()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->pinContent$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getPinFrame()Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->pinFrame$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public final getPinGround()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->pinGround$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getPinRing()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->pinRing$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getPinShadow()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->pinShadow$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->view:Landroid/view/View;

    return-object v0
.end method
