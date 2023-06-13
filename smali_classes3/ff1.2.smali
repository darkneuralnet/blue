.class public final Lff1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010\u000e\n\u0002\u0010\u0001\n\u0002\u0008\u0002\u001a\u000c\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "",
        "",
        "a",
        "jackson_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Ljava/lang/String;)Ljava/lang/Void;
    .locals 1

    new-instance v0, Lco/bird/android/lib/jackson/enums/DuplicateJsonProperty;

    invoke-direct {v0, p0}, Lco/bird/android/lib/jackson/enums/DuplicateJsonProperty;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic access$throwDuplicate(Ljava/lang/String;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0}, Lff1;->a(Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method
