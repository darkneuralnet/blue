.class public synthetic Landroidx/camera/view/PreviewView$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/view/PreviewView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1009
    name = null
.end annotation


# static fields
.field public static final synthetic a:[I

.field public static final synthetic b:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    invoke-static {}, Landroidx/camera/view/PreviewView$d;->values()[Landroidx/camera/view/PreviewView$d;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Landroidx/camera/view/PreviewView$b;->b:[I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Landroidx/camera/view/PreviewView$d;->d:Landroidx/camera/view/PreviewView$d;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x2

    :try_start_1
    sget-object v2, Landroidx/camera/view/PreviewView$b;->b:[I

    sget-object v3, Landroidx/camera/view/PreviewView$d;->c:Landroidx/camera/view/PreviewView$d;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v0, v2, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    invoke-static {}, Landroidx/camera/view/PreviewView$g;->values()[Landroidx/camera/view/PreviewView$g;

    move-result-object v2

    array-length v2, v2

    new-array v2, v2, [I

    sput-object v2, Landroidx/camera/view/PreviewView$b;->a:[I

    :try_start_2
    sget-object v3, Landroidx/camera/view/PreviewView$g;->e:Landroidx/camera/view/PreviewView$g;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v1, v2, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v1, Landroidx/camera/view/PreviewView$b;->a:[I

    sget-object v2, Landroidx/camera/view/PreviewView$g;->d:Landroidx/camera/view/PreviewView$g;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v0, v1, v2
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v0, Landroidx/camera/view/PreviewView$b;->a:[I

    sget-object v1, Landroidx/camera/view/PreviewView$g;->c:Landroidx/camera/view/PreviewView$g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v0, Landroidx/camera/view/PreviewView$b;->a:[I

    sget-object v1, Landroidx/camera/view/PreviewView$g;->h:Landroidx/camera/view/PreviewView$g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v0, Landroidx/camera/view/PreviewView$b;->a:[I

    sget-object v1, Landroidx/camera/view/PreviewView$g;->g:Landroidx/camera/view/PreviewView$g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    :try_start_7
    sget-object v0, Landroidx/camera/view/PreviewView$b;->a:[I

    sget-object v1, Landroidx/camera/view/PreviewView$g;->f:Landroidx/camera/view/PreviewView$g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    return-void
.end method
