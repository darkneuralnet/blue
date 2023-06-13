.class public final LBA0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LBA0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008#\u0010\u0008R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0004\u0012\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0006R \u0010\u000c\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u0004\u0012\u0004\u0008\u000b\u0010\u0008\u001a\u0004\u0008\u0003\u0010\u0006R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u0004\u0012\u0004\u0008\u000f\u0010\u0008\u001a\u0004\u0008\u000e\u0010\u0006R \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0004\u0012\u0004\u0008\u0013\u0010\u0008\u001a\u0004\u0008\u0012\u0010\u0006R \u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0004\u0012\u0004\u0008\u0016\u0010\u0008\u001a\u0004\u0008\n\u0010\u0006R \u0010\u001e\u001a\u00020\u00188\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001a\u0012\u0004\u0008\u001d\u0010\u0008\u001a\u0004\u0008\u001b\u0010\u001cR \u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010\u0004\u0012\u0004\u0008!\u0010\u0008\u001a\u0004\u0008 \u0010\u0006\u00a8\u0006$"
    }
    d2 = {
        "LBA0$a;",
        "",
        "LBA0;",
        "b",
        "LBA0;",
        "a",
        "()LBA0;",
        "getCrop$annotations",
        "()V",
        "Crop",
        "c",
        "getFit$annotations",
        "Fit",
        "d",
        "getFillHeight",
        "getFillHeight$annotations",
        "FillHeight",
        "e",
        "getFillWidth",
        "getFillWidth$annotations",
        "FillWidth",
        "f",
        "getInside$annotations",
        "Inside",
        "Lgo1;",
        "g",
        "Lgo1;",
        "getNone",
        "()Lgo1;",
        "getNone$annotations",
        "None",
        "h",
        "getFillBounds",
        "getFillBounds$annotations",
        "FillBounds",
        "<init>",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final synthetic a:LBA0$a;

.field public static final b:LBA0;

.field public static final c:LBA0;

.field public static final d:LBA0;

.field public static final e:LBA0;

.field public static final f:LBA0;

.field public static final g:Lgo1;

.field public static final h:LBA0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LBA0$a;

    invoke-direct {v0}, LBA0$a;-><init>()V

    sput-object v0, LBA0$a;->a:LBA0$a;

    new-instance v0, LBA0$a$a;

    invoke-direct {v0}, LBA0$a$a;-><init>()V

    sput-object v0, LBA0$a;->b:LBA0;

    new-instance v0, LBA0$a$e;

    invoke-direct {v0}, LBA0$a$e;-><init>()V

    sput-object v0, LBA0$a;->c:LBA0;

    new-instance v0, LBA0$a$c;

    invoke-direct {v0}, LBA0$a$c;-><init>()V

    sput-object v0, LBA0$a;->d:LBA0;

    new-instance v0, LBA0$a$d;

    invoke-direct {v0}, LBA0$a$d;-><init>()V

    sput-object v0, LBA0$a;->e:LBA0;

    new-instance v0, LBA0$a$f;

    invoke-direct {v0}, LBA0$a$f;-><init>()V

    sput-object v0, LBA0$a;->f:LBA0;

    new-instance v0, Lgo1;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1}, Lgo1;-><init>(F)V

    sput-object v0, LBA0$a;->g:Lgo1;

    new-instance v0, LBA0$a$b;

    invoke-direct {v0}, LBA0$a$b;-><init>()V

    sput-object v0, LBA0$a;->h:LBA0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LBA0;
    .locals 1

    sget-object v0, LBA0$a;->b:LBA0;

    return-object v0
.end method

.method public final b()LBA0;
    .locals 1

    sget-object v0, LBA0$a;->c:LBA0;

    return-object v0
.end method

.method public final c()LBA0;
    .locals 1

    sget-object v0, LBA0$a;->f:LBA0;

    return-object v0
.end method
